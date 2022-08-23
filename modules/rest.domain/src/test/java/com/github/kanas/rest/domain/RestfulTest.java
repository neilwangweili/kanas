package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static com.github.kanas.frameworks.domain.core.Testing.by;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RestfulTest {

    @Test
    void should_build_request_entity() {
        assertThat(Request.build()).isInstanceOf(Request.class);
    }

    @Test
    void should_build_request_entity_with_path() {
        Request request = Request.build().path("https://kanas");
        assertEquals("https://kanas", by(request).get("path"));
    }

    @Test
    void should_build_request_entity_with_port() {
        Request request = Request.build().port(8080);
        assertEquals(8080, by(request).<Integer>get("port"));
    }

}
