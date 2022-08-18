package com.github.vwwl.kanas.test.domain;

import org.jetbrains.annotations.NotNull;

public final class TestRequestEntity implements RequestEntity {

    private String path;

    private TestRequestEntity() {
    }

    public static @NotNull RequestEntity build() {
        return new TestRequestEntity();
    }

    @Override
    public @NotNull RequestEntity path(@NotNull final String path) {
        this.path = path;
        return this;
    }

}
