package com.github.kanas.rest.domain;

import org.junit.jupiter.api.*;

import java.util.List;

import static com.github.kanas.core.Testing.by;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RestfulResponseTest {

    @Nested
    class CreateRestfulResponseTest {

        @Test
        void should_create_response() {
            RestfulResponse response = new RestfulResponse("{}");
            assertThat(response).isInstanceOf(Response.class);
        }

        @Test
        void should_get_response_value_when_giving_response_path() {
            RestfulResponse response = new RestfulResponse("{\"name\":\"Neil\"}");
            assertEquals("Neil", by(response.body("$.name")).get("value"));
        }

        @Test
        void should_get_response_value_when_giving_not_exist_response_path() {
            RestfulResponse response = new RestfulResponse("{\"name\":\"Neil\"}");
            assertNull(by(response.body("$.password")).get("value"));
        }

        @SuppressWarnings("unchecked")
        @Test
        void should_get_list_response_value_when_giving_array_response_path() {
            RestfulResponse response = new RestfulResponse("{\"names\":[\"Neil\",\"Jack\"]}");
            assertThat((List<String>) by(response.body("$.names")).get("value")).containsExactly("Neil", "Jack");
        }

    }

    @Nested
    class GetRestfulResponseValueWithBuildFlowTest {

        @Test
        void should_response_as_string_and_get() {
            RestfulResponse response = new RestfulResponse("{\"name\":\"Neil\"}");
            assertNotNull(response.body("$.name").asString().get());
            assertEquals("Neil", response.body("$.name").asString().get());
        }

    }

}
