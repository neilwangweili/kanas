package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class FlowCreator {

    private FlowCreator() {
    }

    static @NotNull StringFlow asString(Object value) {
        return new StringFlow(value);
    }

}
