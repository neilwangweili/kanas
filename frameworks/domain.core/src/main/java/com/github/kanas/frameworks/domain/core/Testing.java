package com.github.kanas.frameworks.domain.core;

import org.jetbrains.annotations.*;

public final class Testing<Content> {

    private final Content content;

    public static <Content> @NotNull Testing<Content> by(@NotNull Content testing) {
        return new Testing<>(testing);
    }

    public Testing(@NotNull final Content content) {
        this.content = content;
    }

    @SuppressWarnings("unchecked")
    public <Field> @Nullable Field get(@NotNull final String fieldName) {
        var field = Exceptions.evaluate(() -> content.getClass().getDeclaredField(fieldName));
        field.setAccessible(true);
        return (Field) Exceptions.evaluate(() -> field.get(content));
    }

}
