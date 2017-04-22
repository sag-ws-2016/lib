/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

import com.sw.thm.model.DrivingLicense;
import javassist.NotFoundException;

import java.util.List;

public interface CleanerServiceInterface {
    DrivingLicense create(DrivingLicense license) throws NotFoundException;
    DrivingLicense update(String id, DrivingLicense license) throws NotFoundException;
    DrivingLicense getByID(String id) throws NotFoundException;
    List<DrivingLicense> getAll();
    void delete(String id) throws NotFoundException;
}

