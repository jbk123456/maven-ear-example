package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO174 {

    @EJB
    private HelperBeanN174 helperBeanN174;

    public String identify() {
        return "HelperBeanO174";
    }
}
