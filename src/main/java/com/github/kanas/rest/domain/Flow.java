package com.github.kanas.rest.domain;

import com.github.kanas.core.Line;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public abstract class Flow<T> {

    private Supplier<T> nullHandler = this::defaultNullHandler;
    private final Lines<T> lines = new Lines<>();

    private final Object value;

    protected Flow(final Object value) {
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    public T get() {
        if (this.value == null) return nullHandler.get();
        if (!matchType(value.getClass())) throw new FlowProducingException("Error, type is mismatch.");
        return lines.produce((T) value);
    }

    public @NotNull Flow<T> nullTo(@NotNull final T element) {
        this.setNullHandler(() -> element);
        return this;
    }

    protected T defaultNullHandler() {
        return null;
    }

    protected void setNullHandler(@NotNull final Supplier<T> nullHandler) {
        this.nullHandler = nullHandler;
    }

    protected void addLine(@NotNull final Line<T> line) {
        this.lines.add(line);
    }

    public abstract @NotNull Must<T> must();

    protected abstract boolean matchType(@NotNull Class<?> underlyingType);

}
