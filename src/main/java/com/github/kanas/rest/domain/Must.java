package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public abstract class Must<T> {

    private final Flow<T> flow;
    private final Matchers<T> matchers = new Matchers<>();

    Must(@NotNull final Flow<T> flow) {
        this.flow = flow;
    }

    public T get() {
        T value = flow.get();
        matchers.match(value);
        return value;
    }

    protected void addMatcher(@NotNull final Matcher<T> matcher) {
        this.matchers.add(matcher);
    }

}
