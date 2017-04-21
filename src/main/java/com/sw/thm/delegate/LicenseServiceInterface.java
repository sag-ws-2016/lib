/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

public interface LicenseServiceInterface {

    public DrivingLicenseServiceInterface getDrivingLicenseService();
    public PassengerTransportLicenseServiceInterface getPassengerTransportLicenseService();
}

