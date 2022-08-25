package com.github.kanas.rest.domain;

import com.github.kanas.rest.acl.JaywayJsonPath;
import org.jetbrains.annotations.NotNull;

public interface JsonPath {

    static @NotNull JsonPath create() {
        return new JaywayJsonPath();
    }

    Object read(@NotNull String content, @NotNull String jsonPath);

}
