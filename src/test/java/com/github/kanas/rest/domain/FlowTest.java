package com.github.kanas.rest.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FlowTest {

    @Test
    void should_produce_null_to_null() {
        assertNull(new ResponseValue("{}", "$.id").asString().get());
    }

    @Test
    void should_not_produce_not_null() {
        assertEquals("abc", new ResponseValue("{\"id\":\"abc\"}", "$.id").asString().get());
    }

    @Test
    void should_produce_with_must() {
        assertEquals("abc", new ResponseValue("{\"id\":\"abc\"}", "$.id").asString().must().get());
    }

    @Test
    void should_throw_exception_when_not_cast_type() {
        assertThrows(FlowProducingException.class, () -> new ResponseValue("{\"id\":123}", "$.id").asString().get());
    }

    @Nested
    class StringFlowTest {

        @Test
        void should_null_to_empty_when_nullToEmpty() {
            assertEquals("", new ResponseValue("{}", "$.id").asString().nullToEmpty().get());
        }

        @Test
        void should_do_nothing_when_nullToEmpty() {
            assertEquals("123", new ResponseValue("{\"id\":\"123\"}", "$.id").asString().nullToEmpty().get());
        }

        @Test
        void should_trim_when_trim() {
            assertEquals("123", new ResponseValue("{\"id\":\"   123   \"}", "$.id").asString().trim().get());
        }

    }

}
