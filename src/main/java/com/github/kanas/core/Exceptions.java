package com.github.kanas.core;

import org.jetbrains.annotations.NotNull;

public interface Exceptions {

    static void execute(@NotNull final RunnableWithCheckedException runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            throw wrap(e);
        }
    }

    static <R> R evaluate(@NotNull final SupplierWithCheckedException<R> supplier) {
        try {
            return supplier.get();
        } catch (Exception e) {
            throw wrap(e);
        }
    }

    static @NotNull RuntimeException wrap(final Throwable throwable) {
        if (throwable instanceof RuntimeException) return (RuntimeException) throwable;
        return new RuntimeException(throwable);
    }

}
