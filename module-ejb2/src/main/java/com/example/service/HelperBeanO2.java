package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO2 {

    @EJB
    private HelperBeanN2 helperBeanN2;

    public String identify() {
        return "HelperBeanO2";
    }
}
