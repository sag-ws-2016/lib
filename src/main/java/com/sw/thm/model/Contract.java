package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Contract implements Serializable{
    protected String id;
    protected double earnings;
    protected int hoursOfWork;
    protected int daysOfHoliday;
    protected Date startDate;
    protected Date endDate;

    public boolean isTemporary() {
        if (endDate == null) {
            return false;
        }else {
            return true;
        }
    }
}
