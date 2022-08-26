package com.github.kanas.rest.domain;

import org.junit.jupiter.api.*;

import static com.github.kanas.rest.domain.FlowCreator.asString;
import static org.junit.jupiter.api.Assertions.*;

class FlowTest {

    @Test
    void should_produce_null_to_null() {
        assertNull(asString(null).get());
    }

    @Test
    void should_not_produce_not_null() {
        assertEquals("abc", asString("abc").get());
    }

    @Test
    void should_produce_with_must() {
        assertEquals("abc", asString("abc").must().get());
    }

    @Test
    void should_throw_exception_when_not_cast_type() {
        assertThrows(FlowProducingException.class, () -> asString(123).get());
    }

    @Test
    void should_produce_null_to_expect() {
        assertEquals("abc", asString(null).nullTo("abc").get());
    }

    @Nested
    class StringFlowTest {

        @Test
        void should_null_to_empty_when_nullToEmpty() {
            assertEquals("", asString(null).nullToEmpty().get());
        }

        @Test
        void should_do_nothing_when_nullToEmpty() {
            assertEquals("123", asString("123").nullToEmpty().get());
        }

        @Test
        void should_trim_when_trim() {
            assertEquals("123", asString("     123    ").trim().get());
        }

        @Test
        void should_match_min_size() {
            assertThrows(AssertionError.class,
                () -> asString("     123    ").trim().must().maxSize(0).get()
            );
        }

        @Test
        void should_match_min_size_when_size_is_good() {
            assertEquals("123", asString("     123    ").trim().must().maxSize(3).get());
        }

    }

}
