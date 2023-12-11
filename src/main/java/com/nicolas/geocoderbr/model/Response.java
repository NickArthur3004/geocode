package com.nicolas.geocoderbr.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

@Getter
@Setter
public class Response {

    @JsonProperty("results")
    private Result[] result;

}
