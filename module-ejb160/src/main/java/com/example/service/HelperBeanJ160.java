package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ160 {

    @EJB
    private HelperBeanI160 helperBeanI160;

    public String identify() {
        return "HelperBeanJ160";
    }
}
