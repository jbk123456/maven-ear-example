package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE45 {

    @EJB
    private HelperBeanD45 helperBeanD45;

    public String identify() {
        return "HelperBeanE45";
    }
}
