package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Service implements Serializable{
    protected String id;
    protected Date date;
    protected String title;
    protected String reasonForService;
    protected int mileage;
    protected double costs;
}
