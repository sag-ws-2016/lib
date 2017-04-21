package com.sw.thm.model;

import lombok.Data;

@Data
public class Personal extends Person {
    protected String type;

    public Personal(Driver driver) {
        type = "DRIVER";
        id = driver.getId();
        firstName = driver.getFirstName();
        lastName = driver.getLastName();
        address = driver.getAddress();
        phoneNumber = driver.getPhoneNumber();
        placeOfBirth = driver.getPlaceOfBirth();
        dateOfBirth = driver.getDateOfBirth();
    }
}
