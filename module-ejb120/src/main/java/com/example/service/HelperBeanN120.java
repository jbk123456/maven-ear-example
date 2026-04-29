package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN120 {

    @EJB
    private HelperBeanM120 helperBeanM120;

    public String identify() {
        return "HelperBeanN120";
    }
}
