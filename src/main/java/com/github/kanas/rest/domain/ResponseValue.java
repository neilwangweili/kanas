package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class ResponseValue {

    private final Object value;

    ResponseValue(@NotNull final String content, @NotNull final String jsonPath) {
        this.value = JsonPath.create().read(content, jsonPath);
    }

    public @NotNull StringFlow asString() {
        return FlowCreator.asString(this.value);
    }

    public Object get() {
        return this.value;
    }

}
