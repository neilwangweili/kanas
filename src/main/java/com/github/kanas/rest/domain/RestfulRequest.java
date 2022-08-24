package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class RestfulRequest implements Request {

    private String host;
    private Integer port;

    RestfulRequest() {
    }

    @Override
    public @NotNull Request host(@NotNull final String host) {
        this.host = host;
        return this;
    }

    @Override
    public @NotNull Request port(@NotNull Integer port) {
        this.port = port;
        return this;
    }

}
