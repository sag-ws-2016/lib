package model;

import java.sql.Timestamp;

/**
 * Created by jonas on 18.01.17.
 */
public class Driver extends Person {
    protected String nationality;
    protected String socialSecurityNumber;
    protected String taxIdentificationNumber;
    protected String taxClass;
    protected String healthInsuranceNumber;
    protected String pin;
    protected Contract contract;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public PassengerTransportLicense getPassengerTransportLicense() {
        return passengerTransportLicense;
    }

    public void setPassengerTransportLicense(PassengerTransportLicense passengerTransportLicense) {
        this.passengerTransportLicense = passengerTransportLicense;
    }

    public Timestamp getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Timestamp employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    protected DrivingLicense drivingLicense;
    protected PassengerTransportLicense passengerTransportLicense;
    protected Timestamp employmentDate;
    protected Timestamp addedDate;
}
