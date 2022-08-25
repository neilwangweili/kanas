package com.github.kanas.rest.domain;

import com.github.kanas.core.Line;

import java.util.function.Supplier;

public abstract class Flow<T> {

    private Supplier<T> nullHandler = this::defaultNullHandler;
    private Line<T> line = this.defaultLine();

    private final ResponseValue responseValue;

    protected Flow(ResponseValue responseValue) {
        this.responseValue = responseValue;
    }

    public T get() {
        Object value = responseValue.get();
        if (value == null) return nullHandler.get();
        if (!matchType(value.getClass())) throw new FlowProducingException("Error, type is mismatch.");
        return line.produce((T) value);
    }

    protected T defaultNullHandler() {
        return null;
    }

    private Line<T> defaultLine() {
        return o -> o;
    }

    public void setNullHandler(Supplier<T> nullHandler) {
        this.nullHandler = nullHandler;
    }

    protected abstract boolean matchType(Class<?> underlyingType);

}
