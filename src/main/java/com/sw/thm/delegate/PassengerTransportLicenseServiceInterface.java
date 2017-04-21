/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

import com.sw.thm.model.PassengerTransportLicense;
import javassist.NotFoundException;

import java.util.List;

public interface PassengerTransportLicenseServiceInterface {
    PassengerTransportLicense create(PassengerTransportLicense license) throws NotFoundException;
    PassengerTransportLicense update(String id, PassengerTransportLicense license) throws NotFoundException;
    PassengerTransportLicense getByID(String id) throws NotFoundException;
    List<PassengerTransportLicense> getAll();
    void delete(String id) throws NotFoundException;
}

