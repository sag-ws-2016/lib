package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "CONTRACT")
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Contract implements Serializable{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    protected String id;
    protected double earnings;
    protected int hoursOfWork;
    protected int daysOfHoliday;
    protected Date startDate;
    protected Date endDate;

    @JsonIgnore
    @Transient
    public boolean isTemporary() {
        if (endDate == null) {
            return false;
        } else {
            return true;
        }
    }
}
