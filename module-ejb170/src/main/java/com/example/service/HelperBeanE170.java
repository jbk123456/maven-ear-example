package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE170 {

    @EJB
    private HelperBeanD170 helperBeanD170;

    public String identify() {
        return "HelperBeanE170";
    }
}
