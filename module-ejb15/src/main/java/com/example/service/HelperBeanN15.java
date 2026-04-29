package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN15 {

    @EJB
    private HelperBeanM15 helperBeanM15;

    public String identify() {
        return "HelperBeanN15";
    }
}
