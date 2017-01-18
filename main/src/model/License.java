package model;

import java.sql.Timestamp;

/**
 * Created by jonas on 18.01.17.
 */
public class License {
    protected String id;
    protected String number;
    protected Timestamp dateOfIssue;
    protected Timestamp expirationDate;

    public License(String id, String number, Timestamp dateOfIssue, Timestamp expirationDate) {
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

    public Timestamp getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Timestamp dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

}
