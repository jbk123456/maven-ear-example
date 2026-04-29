package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO15 {

    @EJB
    private HelperBeanN15 helperBeanN15;

    public String identify() {
        return "HelperBeanO15";
    }
}
