package com.github.kanas.rest.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFlowTest {

    @Test
    void should_produce_null_to_null() {
        assertNull(new ResponseValue("{}", "$.id").asString().get());
    }

    @Test
    void should_not_produce_not_null() {
        assertEquals("abc", new ResponseValue("{\"id\":\"abc\"}", "$.id").asString().get());
    }

    @Test
    void should_throw_exception_when_not_cast_type() {
        assertThrows(FlowProducingException.class, () -> new ResponseValue("{\"id\":123}", "$.id").asString().get());
    }

}