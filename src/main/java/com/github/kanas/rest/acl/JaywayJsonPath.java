package com.github.kanas.rest.acl;

import com.github.kanas.rest.domain.JsonPath;
import com.jayway.jsonpath.Configuration;
import org.jetbrains.annotations.NotNull;

import static com.jayway.jsonpath.Configuration.defaultConfiguration;
import static com.jayway.jsonpath.Option.SUPPRESS_EXCEPTIONS;

public class JaywayJsonPath implements JsonPath {

    @Override
    public Object read(@NotNull final String content, @NotNull final String jsonPath) {
        return com.jayway.jsonpath.JsonPath.compile(jsonPath).read(content, configuration());
    }

    private @NotNull Configuration configuration() {
        return defaultConfiguration().addOptions(SUPPRESS_EXCEPTIONS);
    }

}
