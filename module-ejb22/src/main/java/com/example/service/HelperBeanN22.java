package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN22 {

    @EJB
    private HelperBeanM22 helperBeanM22;

    public String identify() {
        return "HelperBeanN22";
    }
}
