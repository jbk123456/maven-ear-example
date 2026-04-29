package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC15 {

    @EJB
    private HelperBeanB15 helperBeanB15;

    public String identify() {
        return "HelperBeanC15";
    }
}
