package com.pg.test;

import org.springframework.web.client.RestTemplate;

public class Test {
    public static void main(String[] args) throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        for (int i = 0; i < 100; i++) {
            restTemplate.getForObject("http://localhost:8083/index",String.class);
            Thread.sleep(10);
        }
    }
}
