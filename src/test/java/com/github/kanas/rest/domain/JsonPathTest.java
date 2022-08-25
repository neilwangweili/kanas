package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonPathTest {

    @Test
    void should_create_json_path() {
        assertThat(JsonPath.create()).isInstanceOf(JsonPath.class);
    }

    @Test
    void should_JsonPath_parse_json() {
        assertEquals("admin", JsonPath.create().read("{\"name\":\"admin\"}", "$.name"));
    }

}
