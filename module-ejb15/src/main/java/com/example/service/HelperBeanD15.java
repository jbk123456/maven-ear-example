package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD15 {

    @EJB
    private HelperBeanC15 helperBeanC15;

    public String identify() {
        return "HelperBeanD15";
    }
}
