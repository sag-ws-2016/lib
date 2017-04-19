package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Contract implements Serializable{
    protected String id;
    protected double earnings;
    protected int hoursOfWork;
    protected int daysOfHoliday;
    protected Date startDate;
    protected Date endDate;

    @JsonIgnore
    public boolean isTemporary() {
        if (endDate == null) {
            return false;
        }else {
            return true;
        }
    }
}
