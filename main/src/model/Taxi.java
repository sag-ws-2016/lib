package model;

import java.sql.Timestamp;

/**
 * Created by Christoph on 18.01.2017.
 */
public class Taxi extends Vehicle {
    protected String number;
    protected Milage milage;
    protected String yearOfConstruction;
    protected Timestamp purchaseDate;
    protected Service service;

    public Taxi(String id, String numberPlate, Person owner, String insuranceNumber, String insurance, String brand, String type, String number, Milage milage, String yearOfConstruction, Timestamp purchaseDate, Service service) {
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

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
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
        protected Timestamp date;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Timestamp getDate() {
            return date;
        }

        public void setDate(Timestamp date) {
            this.date = date;
        }
    }
}
