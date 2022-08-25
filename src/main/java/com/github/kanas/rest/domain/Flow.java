package com.github.kanas.rest.domain;

import java.util.function.Supplier;

public abstract class Flow<T> {

    private Supplier<T> nullHandler = this::defaultNullHandler;
    private final ResponseValue value;

    protected Flow(ResponseValue value) {
        this.value = value;
    }

    public T get() {
        Object result = value.get();
        if (result == null) return nullHandler.get();
        return (T) result;
    }

    protected T defaultNullHandler() {
        return null;
    }

}
