package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN2 {

    @EJB
    private HelperBeanM2 helperBeanM2;

    public String identify() {
        return "HelperBeanN2";
    }
}
