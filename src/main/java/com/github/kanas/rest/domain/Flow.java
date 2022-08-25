package com.github.kanas.rest.domain;

import java.util.function.Supplier;

public abstract class Flow<T> {

    private Supplier<T> nullHandler = this::defaultNullHandler;
    private final ResponseValue responseValue;

    protected Flow(ResponseValue responseValue) {
        this.responseValue = responseValue;
    }

    public T get() {
        Object value = responseValue.get();
        if (value == null) return nullHandler.get();
        if (!matchType(value.getClass())) throw new FlowProducingException("Error, type is mismatch.");
        return (T) value;
    }

    protected T defaultNullHandler() {
        return null;
    }

    protected abstract boolean matchType(Class<?> underlyingType);

}
