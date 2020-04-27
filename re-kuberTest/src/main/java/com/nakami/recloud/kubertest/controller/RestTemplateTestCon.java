package com.nakami.recloud.kubertest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wuxiao on 2020/4/27
 */
@RestController
public class RestTemplateTestCon {
    @GetMapping("get")
    public String get(){
        String url = "http://user-provider:8092/test/getEcho";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url,
                HttpMethod.GET,
                new HttpEntity<String>(null, new HttpHeaders()),
                String.class);

        System.out.println(response.getBody() + response.getStatusCode());
        return response.getBody() + response.getStatusCode();
    }
}
