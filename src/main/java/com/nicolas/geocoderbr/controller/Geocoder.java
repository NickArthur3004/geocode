package com.nicolas.geocoderbr.controller;

import com.nicolas.geocoderbr.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class Geocoder {

    private static final Object API_KEY = "Chave_do _maps";

    @GetMapping(value = "/test")
    public String test(){
        return "service up";
    }

    @GetMapping(value = "/getLocation")
    public Response getGeoDetails(@RequestParam String address){
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("maps.googleapis.com")
                .path("/maps/api/geocode/json")
                .queryParam("key", API_KEY)
                .queryParam("address", address)
                .build();
        System.out.println(uri.toString());
        ResponseEntity<Response> response = new RestTemplate().getForEntity(uri.toString(), Response.class);
        return response.getBody();
    }
}
