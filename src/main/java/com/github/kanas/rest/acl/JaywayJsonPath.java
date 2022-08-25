package com.github.kanas.rest.acl;

import com.github.kanas.rest.domain.JsonPath;
import com.jayway.jsonpath.Configuration;

import static com.jayway.jsonpath.Configuration.defaultConfiguration;
import static com.jayway.jsonpath.Option.SUPPRESS_EXCEPTIONS;

public class JaywayJsonPath implements JsonPath {

    @Override
    public Object read(String content, String jsonPath) {
        return com.jayway.jsonpath.JsonPath.compile(jsonPath).read(content, configuration());
    }

    private Configuration configuration() {
        return defaultConfiguration().addOptions(SUPPRESS_EXCEPTIONS);
    }

}
