package com.sw.thm.util;

import com.sw.thm.model.Available;
import com.sw.thm.model.Busy;
import com.sw.thm.model.CleanerStateI;
import com.sw.thm.model.NotAvailable;

import javax.persistence.AttributeConverter;

/**
 * Created by jonas on 22.04.17.
 */
public class CleanerStateConverter implements AttributeConverter<CleanerStateI, String>{

    @Override
    public String convertToDatabaseColumn(CleanerStateI attribute) {
        return attribute.getClass().getSimpleName();
    }

    @Override
    public CleanerStateI convertToEntityAttribute(String dbData) {
        switch (dbData){
            case "Available":
                return new Available();
            case "NotAvailable":
                return new NotAvailable();
            case "Busy":
                return new Busy();
            default:
                return null;
        }
    }
}
