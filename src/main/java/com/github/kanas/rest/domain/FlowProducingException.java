package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class FlowProducingException extends IllegalArgumentException {

    public FlowProducingException(@NotNull String message) {
        super(message);
    }

}
