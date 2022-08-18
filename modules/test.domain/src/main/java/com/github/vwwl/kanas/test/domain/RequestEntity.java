package com.github.vwwl.kanas.test.domain;

import org.jetbrains.annotations.NotNull;

public interface RequestEntity {

    @NotNull RequestEntity path(@NotNull String path);

}
