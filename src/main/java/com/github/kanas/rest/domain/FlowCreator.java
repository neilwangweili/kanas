package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class FlowCreator {

    private FlowCreator() {
    }

    public static @NotNull StringFlow asString(ResponseValue value) {
        return new StringFlow(value);
    }
}