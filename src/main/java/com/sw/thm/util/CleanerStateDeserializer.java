package com.sw.thm.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.sw.thm.model.Busy;
import com.sw.thm.model.CleanerStateI;
import com.sw.thm.model.Available;
import com.sw.thm.model.NotAvailable;

import java.io.IOException;

public class CleanerStateDeserializer extends JsonDeserializer<CleanerStateI>
{
    @Override
    public CleanerStateI deserialize(JsonParser p, DeserializationContext ctxt) throws JsonProcessingException, IOException {
        switch (p.getText()){
            case "Available":
                return new Available();
            case "NotAvailable":
                return new NotAvailable();
            case "Busy":
                return new Busy();
            default:
                throw new IOException("Can't Parse CleanerState");
        }
    }
}
