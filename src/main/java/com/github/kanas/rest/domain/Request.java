package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public interface Request {

    static @NotNull Request build() {
        return new RestfulRequest();
    }

    @NotNull Request host(@NotNull String path);

    @NotNull Request port(@NotNull Integer port);

    @NotNull Request path(@NotNull String path);

}
