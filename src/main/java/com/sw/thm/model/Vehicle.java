package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Vehicle implements Serializable{
    protected String id;
    protected String numberPlate;
    protected Person owner;
    protected String insuranceNumber;
    protected String insurance;
    protected String brand;
    protected String type;
}
