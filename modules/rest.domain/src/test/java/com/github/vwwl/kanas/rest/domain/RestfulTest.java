package com.github.vwwl.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static com.github.vwwl.kanas.rest.domain.RestfulRequest.build;
import static org.assertj.core.api.Assertions.assertThat;

class RestfulTest {

    @Test
    void should_build_request_entity() {
        assertThat(build()).isInstanceOf(Request.class);
    }

    @Test
    void should_build_request_entity_with_path() {
        assertThat(build().path("https://kanas")).isInstanceOf(Request.class);
    }

}
