package com.github.kanas.rest.domain;

public class RestfulResponse implements Response {

    private final String content;

    RestfulResponse(String content) {
        this.content = content;
    }

    @Override
    public ResponseValue body(String jsonPath) {
        return new ResponseValue(content, jsonPath);
    }

}
