package com.sw.thm.delegate;

import com.sw.thm.model.Driver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christophcaps on 11.04.17.
 */
public class DriverServiceDelegate implements DriverServiceInterface {
    @Override
    public void create(Driver driver) {
        System.out.println("POST + URL + Driver");
    }

    @Override
    public void update(String id, Driver newDriver) {
        System.out.println("Update driver an mit der ID: id");
    }

    @Override
    public Driver getByID(String id) {
        System.out.println("Request an Server mit ID");
        System.out.println("get JSON");
        System.out.println("mapped in Object ");
        System.out.println("return driver ");
        Driver driver = new Driver();
        return driver;
    }

    @Override
    public List<Driver> getAll() {
        System.out.println("Get a List of all drivers with Serverrequest");
        System.out.println("Returns a List of all drivers");
        List<Driver> driverList = new ArrayList<Driver>();
        return driverList;
    }
}
