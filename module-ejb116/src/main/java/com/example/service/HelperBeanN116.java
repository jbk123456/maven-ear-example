package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN116 {

    @EJB
    private HelperBeanM116 helperBeanM116;

    public String identify() {
        return "HelperBeanN116";
    }
}
