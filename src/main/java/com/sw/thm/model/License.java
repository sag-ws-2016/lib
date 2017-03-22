package com.sw.thm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jonas on 18.01.17.
 */
public class License implements Serializable{
    protected String id;
    protected String number;
    protected Date dateOfIssue;
    protected Date expirationDate;

    public License() {
    }

    public License(String id, String number, Date dateOfIssue, Date expirationDate) {
        this.id = id;
        this.number = number;
        this.dateOfIssue = dateOfIssue;
        this.expirationDate = expirationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
