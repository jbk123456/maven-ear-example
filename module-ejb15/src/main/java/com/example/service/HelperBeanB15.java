package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB15 {

    @EJB
    private HelperBeanA15 helperBeanA15;

    public String identify() {
        return "HelperBeanB15";
    }
}
