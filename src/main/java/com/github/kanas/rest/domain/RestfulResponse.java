package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class RestfulResponse implements Response {

    private final String content;

    RestfulResponse(String content) {
        this.content = content;
    }

    @Override
    public @NotNull ResponseValue body(@NotNull String jsonPath) {
        return new ResponseValue(content, jsonPath);
    }

}
