/**
 * Created by christophcaps on 11.04.17.
 */

package com.sw.thm.delegate;

import com.sw.thm.model.Driver;

import java.util.List;

public interface DriverServiceInterface {
    void create(Driver driver);
    void update(String id, Driver newDriver);
    Driver getByID(String id);
    List<Driver> getAll();
}

