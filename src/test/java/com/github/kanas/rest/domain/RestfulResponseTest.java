package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static com.github.kanas.core.Testing.by;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestfulResponseTest {

    @Test
    void should_create_response() {
        RestfulResponse response = new RestfulResponse("{}");
        assertThat(response).isInstanceOf(Response.class);
    }

    @Test
    void should_get_response_value_when_giving_response_path() {
        RestfulResponse response = new RestfulResponse("{\"name\":\"admin\"}");
        assertEquals("admin", by(response.body("$.name")).get("value"));
    }

}
