package com.github.kanas.rest.domain;

import com.github.kanas.rest.acl.JaywayJsonPath;

public interface JsonPath {

    static JsonPath create() {
        return new JaywayJsonPath();
    }

    Object read(String content, String jsonPath);

}
