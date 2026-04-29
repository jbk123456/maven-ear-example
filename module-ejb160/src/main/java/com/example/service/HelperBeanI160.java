package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI160 {

    @EJB
    private HelperBeanH160 helperBeanH160;

    public String identify() {
        return "HelperBeanI160";
    }
}
