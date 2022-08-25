package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class MustCreator {
    private MustCreator() {
    }

    public static @NotNull StringMust stringMust(@NotNull final StringFlow flow) {
        return new StringMust(flow);
    }
}
