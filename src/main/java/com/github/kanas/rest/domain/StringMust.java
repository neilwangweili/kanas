package com.github.kanas.rest.domain;

import org.jetbrains.annotations.NotNull;

import static com.github.kanas.rest.domain.MatcherCreator.stringMaxSizeMatcher;

public class StringMust extends Must<String> {

    StringMust(@NotNull StringFlow flow) {
        super(flow);
    }

    public @NotNull StringMust maxSize(final int maxSize) {
        addMatcher(stringMaxSizeMatcher(maxSize));
        return this;
    }

}
