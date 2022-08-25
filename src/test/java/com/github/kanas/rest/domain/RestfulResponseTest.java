package com.github.kanas.rest.domain;

import com.github.kanas.core.Response;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestfulResponseTest {

    @Test
    void should_create_response() {
        RestfulResponse response = new RestfulResponse("{}");
        assertThat(response).isInstanceOf(Response.class);
    }

}
