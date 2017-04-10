package com.sw.thm.util;

import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by jonas on 24.03.17.
 */
public class ObjectMapper extends com.fasterxml.jackson.databind.ObjectMapper{
    public ObjectMapper() {
        super();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        this.setDateFormat(df);
    }
    public String dataToJson(Object data) {
        try {
            this.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            this.writeValue(sw, data);
            return sw.toString();
        } catch (IOException e){
            throw new RuntimeException("IOException from a StringWriter?");
        }
    }
}
