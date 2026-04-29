package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN42 {

    @EJB
    private HelperBeanM42 helperBeanM42;

    public String identify() {
        return "HelperBeanN42";
    }
}
