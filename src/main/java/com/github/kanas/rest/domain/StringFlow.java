package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public class StringFlow extends Flow<String> {

    protected StringFlow(final ResponseValue value) {
        super(value);
    }

    public @NotNull StringFlow nullToEmpty() {
        setNullHandler(() -> "");
        return this;
    }

    @Override
    protected boolean matchType(@NotNull final Class<?> underlyingType) {
        return String.class.isAssignableFrom(underlyingType);
    }

}
