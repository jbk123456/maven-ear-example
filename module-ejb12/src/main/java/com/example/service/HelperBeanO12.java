package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO12 {

    @EJB
    private HelperBeanN12 helperBeanN12;

    public String identify() {
        return "HelperBeanO12";
    }
}
