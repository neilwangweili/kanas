package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static com.github.kanas.frameworks.domain.core.Testing.by;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestfulRequestTest {

    @Test
    void should_build_request_entity() {
        assertThat(Request.build()).isInstanceOf(Request.class);
    }

    @Test
    void should_build_request_entity_with_host() {
        var request = Request.build().host("https://kanas");
        assertEquals("https://kanas", by(request).get("host"));
    }

    @Test
    void should_build_request_entity_with_port() {
        var request = Request.build().port(8080);
        assertEquals(8080, by(request).<Integer>get("port"));
    }

}
