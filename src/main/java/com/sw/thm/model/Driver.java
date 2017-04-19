package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import java.util.Date;
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
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
}
