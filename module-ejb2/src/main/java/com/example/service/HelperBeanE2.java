package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE2 {

    @EJB
    private HelperBeanD2 helperBeanD2;

    public String identify() {
        return "HelperBeanE2";
    }
}
