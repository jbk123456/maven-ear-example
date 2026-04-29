package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI15 {

    @EJB
    private HelperBeanH15 helperBeanH15;

    public String identify() {
        return "HelperBeanI15";
    }
}
