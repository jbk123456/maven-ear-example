package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG15 {

    @EJB
    private HelperBeanF15 helperBeanF15;

    public String identify() {
        return "HelperBeanG15";
    }
}
