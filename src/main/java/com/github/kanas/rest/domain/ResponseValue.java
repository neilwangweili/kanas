package com.github.kanas.rest.domain;

import com.github.kanas.flow.domain.Flow;
import org.jetbrains.annotations.NotNull;

public final class ResponseValue<T> {

    private final Object value;
    private final Flow<T> flow;

    ResponseValue(@NotNull final String content, @NotNull final String jsonPath, Flow<T> flow) {
        this.value = JsonPath.create().read(content, jsonPath);
        this.flow = flow;
    }

    public @NotNull ResponseValue<String> asString() {
        return null;
    }

    public T get() {
        return flow.produce(value);
    }

}
