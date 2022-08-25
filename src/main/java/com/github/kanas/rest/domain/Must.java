package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class Must<T> {

    private final Flow<T> flow;

    Must(@NotNull final Flow<T> flow) {
        this.flow = flow;
    }

    public T get() {
        return flow.get();
    }

}
