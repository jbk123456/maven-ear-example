package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN54 {

    @EJB
    private HelperBeanM54 helperBeanM54;

    public String identify() {
        return "HelperBeanN54";
    }
}
