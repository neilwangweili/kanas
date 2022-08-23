package com.github.kanas.frameworks.domain.core;

import org.jetbrains.annotations.*;

public final class Testing<Content> {

    private final Content t;

    public static <Content> @NotNull Testing<Content> by(@NotNull Content testing) {
        return new Testing<>(testing);
    }

    public Testing(@NotNull final Content t) {
        this.t = t;
    }

    @SuppressWarnings("unchecked")
    public <Field> @Nullable Field get(@NotNull final String fieldName) {
        java.lang.reflect.Field field = Exceptions.evaluate(() -> t.getClass().getDeclaredField(fieldName));
        field.setAccessible(true);
        return (Field) Exceptions.evaluate(() -> field.get(t));
    }

}
