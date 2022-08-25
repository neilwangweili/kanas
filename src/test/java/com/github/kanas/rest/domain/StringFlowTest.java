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

}
