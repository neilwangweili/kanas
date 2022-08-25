package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

public final class MatcherCreator {

    private MatcherCreator() {
    }

    static @NotNull BodyCastStringMaxSizeMatcher stringMaxSizeMatcher(int maxSize) {
        return new BodyCastStringMaxSizeMatcher(maxSize);
    }

}
