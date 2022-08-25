package com.github.kanas.flow.domain;

import org.jetbrains.annotations.NotNull;

public class FlowProducingException extends IllegalArgumentException {

    public FlowProducingException(@NotNull String message) {
        super(message);
    }

}
