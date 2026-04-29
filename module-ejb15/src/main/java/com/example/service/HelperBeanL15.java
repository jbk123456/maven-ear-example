package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL15 {

    @EJB
    private HelperBeanK15 helperBeanK15;

    public String identify() {
        return "HelperBeanL15";
    }
}
