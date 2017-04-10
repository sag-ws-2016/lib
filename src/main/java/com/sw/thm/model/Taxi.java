package com.sw.thm.model;

import lombok.Data;

import java.util.Date;

@Data
public class Taxi extends Vehicle {
    protected String number;
    protected Mileage mileage;
    protected String yearOfConstruction;
    protected Date purchaseDate;
    protected Service service;

    @Data
    class Mileage {
        protected int value;
        protected Date date;
    }
}
