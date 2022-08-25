package com.github.kanas.flow.domain;

import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public abstract class Flow<T> {

    private Supplier<T> nullHandler = this::defaultNullHandler;

    public T produce(@Nullable Object value) {
        if (value == null) return nullHandler.get();
        return (T) value;
    }

    protected T defaultNullHandler() {
        return null;
    }

}
