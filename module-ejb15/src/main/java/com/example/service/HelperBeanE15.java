package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE15 {

    @EJB
    private HelperBeanD15 helperBeanD15;

    public String identify() {
        return "HelperBeanE15";
    }
}
