package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE117 {

    @EJB
    private HelperBeanD117 helperBeanD117;

    public String identify() {
        return "HelperBeanE117";
    }
}
