package com.github.vwwl.kanas.test.domain;

import org.junit.jupiter.api.Test;

import static com.github.vwwl.kanas.test.domain.TestRequestEntity.build;
import static org.assertj.core.api.Assertions.assertThat;

class TestRequestEntityTest {

    @Test
    void should_build_request_entity() {
        assertThat(build()).isInstanceOf(RequestEntity.class);
    }

    @Test
    void should_build_request_entity_with_path() {
        assertThat(build().path("https://kanas")).isInstanceOf(RequestEntity.class);
    }

}
