package com.github.kanas.rest.domain;

import com.jayway.jsonpath.JsonPath;

public class ResponseValue {

    private final Object value;

    ResponseValue(String content, String jsonPath) {
        this.value = JsonPath.compile(jsonPath).read(content);
    }

}
