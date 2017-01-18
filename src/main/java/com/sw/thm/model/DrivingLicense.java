package com.sw.thm.model;

import java.sql.Timestamp;

/**
 * Created by jonas on 18.01.17.
 */
public class DrivingLicense extends License {
    protected String licenseClass;

    public DrivingLicense() {
    }

    public DrivingLicense(String id, String number, Timestamp dateOfIssue, Timestamp expirationDate, String licenseClass) {
        super(id, number, dateOfIssue, expirationDate);
        this.licenseClass = licenseClass;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }
}
