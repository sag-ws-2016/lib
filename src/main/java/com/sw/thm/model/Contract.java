package com.sw.thm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jonas on 18.01.17.
 */
public class Contract implements Serializable{
    protected String id;
    protected double earnings;
    protected int hoursOfWork;
    protected int daysOfHoliday;
    protected Date startDate;
    protected Date endDate;

    public Contract() {
    }

    public Contract(String id, double earnings, int hoursOfWork, int daysOfHoliday, Date startDate, Date endDate) {
        this.id = id;
        this.earnings = earnings;
        this.hoursOfWork = hoursOfWork;
        this.daysOfHoliday = daysOfHoliday;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public int getDaysOfHoliday() {
        return daysOfHoliday;
    }

    public void setDaysOfHoliday(int daysOfHoliday) {
        this.daysOfHoliday = daysOfHoliday;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isTemporary() {
        if (endDate == null) {
            return false;
        }else {
            return true;
        }
    }
}
