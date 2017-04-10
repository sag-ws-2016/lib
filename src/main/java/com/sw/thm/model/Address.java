package com.sw.thm.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Created by jonas on 18.01.17.
 */
@Entity
@Table( name = "ADDRESS" )
@Data
public class Address implements Serializable{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    protected String id;
    protected String street;
    protected String houseNumber;
    protected String city;
    protected String zip;
    protected String country;
    protected String careOf;

}
