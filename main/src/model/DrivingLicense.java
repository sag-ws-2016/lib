package model;

/**
 * Created by jonas on 18.01.17.
 */
public class DrivingLicense extends License {
    protected String licenseClass;

    public String getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }
}
