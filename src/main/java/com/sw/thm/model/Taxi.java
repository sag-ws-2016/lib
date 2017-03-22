package com.sw.thm.model;

import java.util.Date;

/**
 * Created by Christoph on 18.01.2017.
 */
public class Taxi extends Vehicle {
    protected String number;
    protected Milage milage;
    protected String yearOfConstruction;
    protected Date purchaseDate;
    protected Service service;

    public Taxi() {
    }

    public Taxi(String id, String numberPlate, Person owner, String insuranceNumber, String insurance, String brand, String type, String number, Milage milage, String yearOfConstruction, Date purchaseDate, Service service) {
        super(id, numberPlate, owner, insuranceNumber, insurance, brand, type);
        this.number = number;
        this.milage = milage;
        this.yearOfConstruction = yearOfConstruction;
        this.purchaseDate = purchaseDate;
        this.service = service;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Milage getMilage() {
        return milage;
    }

    public void setMilage(Milage milage) {
        this.milage = milage;
    }

    public String getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(String yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    class Milage {
        protected int value;
        protected Date date;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }
}
