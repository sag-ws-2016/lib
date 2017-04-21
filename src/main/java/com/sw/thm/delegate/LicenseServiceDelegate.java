package com.sw.thm.delegate;

public class LicenseServiceDelegate implements LicenseServiceInterface {

    private DrivingLicenseServiceInterface drivingLicenseService;
    private PassengerTransportLicenseServiceInterface passengerTransportLicenseService;

    public LicenseServiceDelegate() {
        this.drivingLicenseService = new DrivingLicenseServiceDelegate();
        this.passengerTransportLicenseService = new PassengerTransportLicenseServiceDelegate();
    }

    @Override
    public DrivingLicenseServiceInterface getDrivingLicenseService() {
        return drivingLicenseService;
    }

    @Override
    public PassengerTransportLicenseServiceInterface getPassengerTransportLicenseService() {
        return passengerTransportLicenseService;
    }
}
