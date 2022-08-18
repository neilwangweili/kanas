package com.github.vwwl.kanas.test;

import com.github.vwwl.kanas.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.*;

import java.net.URI;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRestTemplateTest extends IntegrationTest {

    @Test
    void should_create_request_entity_as_expect() {
        RequestEntity<Map<String, String>> response = springTestRestTemplate().buildRequest("https://kanas?source={source}", Map.of("message", "ok"), HttpMethod.POST, "browser");
        assertEquals(response.getMethod(), HttpMethod.POST);
        assertEquals(response.getUrl(), URI.create("https://kanas?source=browser"));
        assertEquals(response.getBody(), Map.of("message", "ok"));
    }

}
