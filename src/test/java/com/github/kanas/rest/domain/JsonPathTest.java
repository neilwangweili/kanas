package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonPathTest {

    @Test
    void should_create_json_path() {
        assertThat(JsonPath.create()).isInstanceOf(JsonPath.class);
    }

    @Test
    void should_JsonPath_parse_json() {
        assertEquals("Neil", JsonPath.create().read("{\"name\":\"Neil\"}", "$.name"));
    }

    @SuppressWarnings("unchecked")
    @Test
    void should_JsonPath_parse_json_array() {
        assertThat((List<String>) JsonPath.create().read("{\"names\":[\"Neil\",\"Jack\"]}", "$.names")).containsExactly("Neil", "Jack");
    }

}
