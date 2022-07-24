package com.project.first.controller;
import com.project.first.config.ApplicationProperties;
import com.project.first.dto.Request;
import com.project.first.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Home {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApplicationProperties aplicationProperties;

    @GetMapping("/call/water-management/{id}")
    public ResponseEntity<?> findOrder(@PathVariable String id){
        ResponseEntity<String> response ;
        String str=aplicationProperties.getBaseUrl()+aplicationProperties.getContext()+aplicationProperties.getView()+id;
        response = restTemplate.getForEntity(str,String.class);
        return response;
    }

    @PostMapping("/create/order")
    public ResponseEntity<?> createOrder(@RequestBody Request request) {
        String uri = aplicationProperties.getBaseUrl() + aplicationProperties.getContext() + aplicationProperties.getCreate();
        System.out.println(uri);
        Response response = restTemplate.postForObject(uri,request,Response.class);
        return ResponseEntity.ok(response);
    }
}
