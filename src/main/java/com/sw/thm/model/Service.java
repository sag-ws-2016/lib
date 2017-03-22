package com.sw.thm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Christoph on 18.01.2017.
 */
public class Service implements Serializable{
    protected String id;
    protected Date date;
    protected String title;
    protected String reasonForService;
    protected int mileage;
    protected double costs;

    public Service() {
    }

    public Service(String id, Date date, String title, String reasonForService, int mileage, double costs) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.reasonForService = reasonForService;
        this.mileage = mileage;
        this.costs = costs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReasonForService() {
        return reasonForService;
    }

    public void setReasonForService(String reasonForService) {
        this.reasonForService = reasonForService;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }
}
