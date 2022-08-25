package com.github.kanas.rest.domain;

public class ResponseValue {

    private final Object value;

    ResponseValue(String content, String jsonPath) {
        this.value = JsonPath.create().read(content, jsonPath);
    }

}
