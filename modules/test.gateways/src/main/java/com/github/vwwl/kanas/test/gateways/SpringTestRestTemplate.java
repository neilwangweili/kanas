package com.github.vwwl.kanas.test.gateways;

import com.github.vwwl.kanas.test.domain.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@Component
public class SpringTestRestTemplate implements TestRestTemplate {

    private @Resource org.springframework.boot.test.web.client.TestRestTemplate impl;

    public <Body> RequestEntity<Body> buildRequest(final String url, final Body body, final HttpMethod httpMethod, final Object... vars) {
        URI uri = UriComponentsBuilder.fromUriString(url).buildAndExpand(vars).encode().toUri();
        return new RequestEntity<>(body, new HttpHeaders(), httpMethod, uri);
    }

}
