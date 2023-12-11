package com.nicolas.geocoderbr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nicolas.geocoderbr.controller.Geocoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

    @JsonProperty("formatted_address")
    private String address;
    private Geometry geometry;
}
