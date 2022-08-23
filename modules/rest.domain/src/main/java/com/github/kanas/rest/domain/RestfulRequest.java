package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class RestfulRequest implements Request {

    private String path;
    private Integer port;

    RestfulRequest() {
    }

    @Override
    public @NotNull Request path(@NotNull final String path) {
        this.path = path;
        return this;
    }

    @Override
    public @NotNull Request port(@NotNull Integer port) {
        this.port = port;
        return this;
    }

}
