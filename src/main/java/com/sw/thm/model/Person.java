package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable{
    protected String id;
    protected String firstName;
    protected String lastName;
    protected Address address;
    protected String phoneNumber;
    protected String placeOfBirth;
    protected String dateOfBirth;
}
