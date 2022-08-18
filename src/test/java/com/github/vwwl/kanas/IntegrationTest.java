package com.github.vwwl.kanas;

import com.github.vwwl.kanas.test.domain.TestRestTemplate;
import com.github.vwwl.kanas.test.gateways.SpringTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class IntegrationTest {
    private @Resource TestRestTemplate testRestTemplate;
    private @Resource SpringTestRestTemplate springTestRestTemplate;

    protected TestRestTemplate testRestTemplate() {
        return testRestTemplate;
    }

    public SpringTestRestTemplate springTestRestTemplate() {
        return springTestRestTemplate;
    }

}
