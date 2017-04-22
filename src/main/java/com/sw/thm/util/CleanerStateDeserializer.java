package com.sw.thm.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.sw.thm.model.CleanerStateI;

import java.io.IOException;

public class CleanerStateDeserializer extends JsonDeserializer<CleanerStateI>
{
    @Override
    public CleanerStateI deserialize(JsonParser p, DeserializationContext ctxt) throws JsonProcessingException, IOException {
        CleanerStateConverter cleanerStateConverter = new CleanerStateConverter();
        return cleanerStateConverter.convertToEntityAttribute(p.getText());
    }
}
