package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH15 {

    @EJB
    private HelperBeanG15 helperBeanG15;

    public String identify() {
        return "HelperBeanH15";
    }
}
