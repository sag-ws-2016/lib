package com.sw.thm.model;

import java.util.Date;

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
    protected DrivingLicense drivingLicense;
    protected PassengerTransportLicense passengerTransportLicense;
    protected Date employmentDate;
    protected Date addedDate;

    public Driver() {
    }

    public Driver(String id, String firstName, String lastName, Address address, String phoneNumber, String placeOfBirth, String dateOfBirth, String nationality, String socialSecurityNumber, String taxIdentificationNumber, String taxClass, String healthInsuranceNumber, String pin, Contract contract, DrivingLicense drivingLicense, PassengerTransportLicense passengerTransportLicense, Date employmentDate, Date addedDate) {
        super(id, firstName, lastName, address, phoneNumber, placeOfBirth, dateOfBirth);
        this.nationality = nationality;
        this.socialSecurityNumber = socialSecurityNumber;
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.taxClass = taxClass;
        this.healthInsuranceNumber = healthInsuranceNumber;
        this.pin = pin;
        this.contract = contract;
        this.drivingLicense = drivingLicense;
        this.passengerTransportLicense = passengerTransportLicense;
        this.employmentDate = employmentDate;
        this.addedDate = addedDate;
    }

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

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }


}
