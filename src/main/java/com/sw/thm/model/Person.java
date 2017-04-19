package com.sw.thm.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE")
@Data
public class Person implements Serializable{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    protected String id;
    protected String firstName;
    protected String lastName;
    @ManyToOne
    protected Address address;
    protected String phoneNumber;
    protected String placeOfBirth;
    protected String dateOfBirth;
}
