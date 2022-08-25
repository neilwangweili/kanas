package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

import static com.github.kanas.rest.domain.MustCreator.stringMust;

public class StringFlow extends Flow<String> {

    protected StringFlow(final ResponseValue value) {
        super(value);
    }

    @Override
    public @NotNull Must<String> must() {
        return stringMust(this);
    }

    public @NotNull StringFlow nullToEmpty() {
        setNullHandler(() -> "");
        return this;
    }

    public @NotNull StringFlow trim() {
        addLine(String::trim);
        return this;
    }

    @Override
    protected boolean matchType(@NotNull final Class<?> underlyingType) {
        return String.class.isAssignableFrom(underlyingType);
    }

}
