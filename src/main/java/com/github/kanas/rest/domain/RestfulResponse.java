package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

import static com.github.kanas.flow.core.FlowCreator.asObject;

public class RestfulResponse implements Response {

    private final String content;

    RestfulResponse(String content) {
        this.content = content;
    }

    @Override
    public @NotNull ResponseValue<Object> body(@NotNull String jsonPath) {
        return new ResponseValue<>(content, jsonPath, asObject());
    }

}
