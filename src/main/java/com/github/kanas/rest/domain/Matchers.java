package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Matchers<T> {

    private final List<Matcher<T>> matchers;

    Matchers() {
        this.matchers = new ArrayList<>();
    }

    void match(T value) {
        matchers.stream().parallel().forEach(matcher -> matcher.match(value));
    }

    void add(@NotNull final Matcher<T> matcher) {
        this.matchers.add(matcher);
    }

}
