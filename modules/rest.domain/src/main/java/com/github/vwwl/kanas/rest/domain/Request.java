package com.github.vwwl.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public interface Request {

    @NotNull Request path(@NotNull String path);

    @NotNull Request port(@NotNull Integer port);

}
