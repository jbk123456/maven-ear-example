package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL53 {

    @EJB
    private HelperBeanK53 helperBeanK53;

    public String identify() {
        return "HelperBeanL53";
    }
}
