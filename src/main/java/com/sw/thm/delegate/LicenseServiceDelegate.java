package com.sw.thm.delegate;

/**
 * Created by jonas on 21.04.17.
 */
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
