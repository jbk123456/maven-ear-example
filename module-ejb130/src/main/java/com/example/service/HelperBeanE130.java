package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE130 {

    @EJB
    private HelperBeanD130 helperBeanD130;

    public String identify() {
        return "HelperBeanE130";
    }
}
