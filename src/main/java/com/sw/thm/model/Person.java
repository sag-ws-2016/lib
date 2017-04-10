package com.sw.thm.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE")
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
