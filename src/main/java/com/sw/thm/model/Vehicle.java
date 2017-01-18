package com.sw.thm.model;

/**
 * Created by Christoph on 18.01.2017.
 */
public class Vehicle {
    protected String id;
    protected String numberPlate;
    protected Person owner;
    protected String insuranceNumber;
    protected String insurance;
    protected String brand;
    protected String type;

    public Vehicle() {
    }

    public Vehicle(String id, String numberPlate, Person owner, String insuranceNumber, String insurance, String brand, String type) {
        this.id = id;
        this.numberPlate = numberPlate;
        this.owner = owner;
        this.insuranceNumber = insuranceNumber;
        this.insurance = insurance;
        this.brand = brand;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
