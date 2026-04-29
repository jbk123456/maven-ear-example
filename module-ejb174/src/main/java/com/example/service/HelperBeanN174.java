package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN174 {

    @EJB
    private HelperBeanM174 helperBeanM174;

    public String identify() {
        return "HelperBeanN174";
    }
}
