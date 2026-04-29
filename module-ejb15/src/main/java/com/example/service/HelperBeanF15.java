package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF15 {

    @EJB
    private HelperBeanE15 helperBeanE15;

    public String identify() {
        return "HelperBeanF15";
    }
}
