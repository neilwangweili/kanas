package com.github.vwwl.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class RestfulRequest implements Request {

    private String path;

    private RestfulRequest() {
    }

    public static @NotNull Request build() {
        return new RestfulRequest();
    }

    @Override
    public @NotNull Request path(@NotNull final String path) {
        this.path = path;
        return this;
    }

}
