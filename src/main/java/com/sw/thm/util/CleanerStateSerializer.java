package com.sw.thm.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.sw.thm.model.CleanerStateI;

import java.io.IOException;

public class CleanerStateSerializer extends JsonSerializer<CleanerStateI>
{
    @Override
    public void serialize(CleanerStateI value, JsonGenerator jgen,
                          SerializerProvider provider)
            throws IOException, JsonProcessingException
    {
        jgen.writeString(value.getClass().getSimpleName());
    }

}
