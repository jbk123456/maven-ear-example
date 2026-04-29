package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI2 {

    @EJB
    private HelperBeanH2 helperBeanH2;

    public String identify() {
        return "HelperBeanI2";
    }
}
