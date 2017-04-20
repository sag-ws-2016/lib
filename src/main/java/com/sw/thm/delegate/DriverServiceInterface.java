/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

import com.sw.thm.model.Driver;
import javassist.NotFoundException;

import java.util.List;

public interface DriverServiceInterface {
    Driver create(Driver driver) throws NotFoundException;
    Driver update(String id, Driver newDriver) throws NotFoundException;
    Driver getByID(String id) throws NotFoundException;
    List<Driver> getAll();
    void delete (String id) throws NotFoundException;
}

