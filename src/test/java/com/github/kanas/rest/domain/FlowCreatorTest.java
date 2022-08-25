package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlowCreatorTest {

    @Test
    void should_create_string_flow() {
        assertThat(FlowCreator.asString(null)).isInstanceOf(Flow.class);
    }

}
