package com.sw.thm.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;

import java.io.IOException;

/**
 * Created by jonas on 20.04.17.
 */
public class UnirestMapper implements ObjectMapper {
    private com.sw.thm.util.ObjectMapper jacksonObjectMapper = new com.sw.thm.util.ObjectMapper();

    @Override
    public <T> T readValue(String value, Class<T> valueType) {
        try {
            return jacksonObjectMapper.readValue(value, valueType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String writeValue(Object value) {
        try {
            return jacksonObjectMapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
