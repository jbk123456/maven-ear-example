package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM15 {

    @EJB
    private HelperBeanL15 helperBeanL15;

    public String identify() {
        return "HelperBeanM15";
    }
}
