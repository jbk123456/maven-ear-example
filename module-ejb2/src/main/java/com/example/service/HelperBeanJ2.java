package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ2 {

    @EJB
    private HelperBeanI2 helperBeanI2;

    public String identify() {
        return "HelperBeanJ2";
    }
}
