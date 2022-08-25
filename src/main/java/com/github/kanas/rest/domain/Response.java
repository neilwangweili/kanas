package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public interface Response {

    @NotNull ResponseValue body(@NotNull String jsonPath);

}
