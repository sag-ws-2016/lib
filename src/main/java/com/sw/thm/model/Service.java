package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Service implements Serializable{
    protected String id;
    protected Date date;
    protected String title;
    protected String reasonForService;
    protected int mileage;
    protected double costs;
}
