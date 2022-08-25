package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

import static org.assertj.core.api.Assertions.assertThat;

public class BodyCastStringMaxSizeMatcher implements BodyCastStringMatcher {

    private final int size;

    BodyCastStringMaxSizeMatcher(final int size) {
        this.size = size;
    }

    @Override
    public void match(@NotNull final String value) {
        assertThat(value).hasSizeLessThanOrEqualTo(size);
    }

}
