package com.github.kanas.rest.domain;

public class RestfulResponse implements Response {

    private final String content;

    RestfulResponse(String content) {
        this.content = content;
    }

}
