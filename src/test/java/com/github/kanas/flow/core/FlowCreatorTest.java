package com.github.kanas.flow.core;

import com.github.kanas.flow.domain.Flow;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlowCreatorTest {

    @Test
    void should_create_object_flow() {
        assertThat(FlowCreator.asObject()).isInstanceOf(Flow.class);
    }

    @Test
    void should_create_string_flow() {
        assertThat(FlowCreator.asString()).isInstanceOf(Flow.class);
    }

}
