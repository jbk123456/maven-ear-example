package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ15 {

    @EJB
    private HelperBeanI15 helperBeanI15;

    public String identify() {
        return "HelperBeanJ15";
    }
}
