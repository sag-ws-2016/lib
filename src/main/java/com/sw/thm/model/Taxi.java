package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.Date;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Taxi extends Vehicle {
    protected String number;
    protected Mileage mileage;
    protected String yearOfConstruction;
    protected Date purchaseDate;
    protected Service service;

    @Data
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
    class Mileage {
        protected int value;
        protected Date date;
    }
}
