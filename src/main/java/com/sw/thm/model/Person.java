package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE")
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
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
    protected Date dateOfBirth;
}
