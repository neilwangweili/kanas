package com.github.kanas.rest.domain;

import com.github.kanas.core.Response;

public class RestfulResponse implements Response {

    private final String content;

    RestfulResponse(String content) {
        this.content = content;
    }

}
