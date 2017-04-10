package com.sw.thm.model;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;

@Data
public class ContractTemplate implements Serializable{
    protected String title;
    protected LinkedList sections;
}
