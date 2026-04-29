package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN9 {

    @EJB
    private HelperBeanM9 helperBeanM9;

    public String identify() {
        return "HelperBeanN9";
    }
}
