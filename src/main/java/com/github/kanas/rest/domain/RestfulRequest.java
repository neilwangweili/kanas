package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class RestfulRequest implements Request {

    private String host;
    private Integer port;
    private String path;

    RestfulRequest() {
    }

    @Override
    public @NotNull Request host(@NotNull final String host) {
        this.host = host;
        return this;
    }

    @Override
    public @NotNull Request port(@NotNull final Integer port) {
        this.port = port;
        return this;
    }

    @Override
    public @NotNull Request path(@NotNull final String path) {
        this.path = path;
        return this;
    }

}
