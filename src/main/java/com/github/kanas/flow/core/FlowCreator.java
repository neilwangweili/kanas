package com.github.kanas.flow.core;

import com.github.kanas.flow.domain.*;
import org.jetbrains.annotations.NotNull;

public final class FlowCreator {

    private FlowCreator() {
    }

    public static @NotNull Flow<Object> asObject() {
        return new ObjectFlow();
    }
}
