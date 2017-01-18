package model;

import java.sql.Timestamp;

/**
 * Created by jonas on 18.01.17.
 */
public class Contract {
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

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public boolean isTemporary() {
        if (endDate == null) {
            return true;
        }else {
            return false;
        }
    }

    protected String id;
    protected double earnings;
    protected int hoursOfWork;
    protected int daysOfHoliday;
    protected Timestamp startDate;
    protected Timestamp endDate;
}
