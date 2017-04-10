package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class License implements Serializable{
    protected String id;
    protected String number;
    protected Date dateOfIssue;
    protected Date expirationDate;
}
