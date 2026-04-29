package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN35 {

    @EJB
    private HelperBeanM35 helperBeanM35;

    public String identify() {
        return "HelperBeanN35";
    }
}
