package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK15 {

    @EJB
    private HelperBeanJ15 helperBeanJ15;

    public String identify() {
        return "HelperBeanK15";
    }
}
