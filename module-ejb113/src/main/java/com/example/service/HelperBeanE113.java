package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE113 {

    @EJB
    private HelperBeanD113 helperBeanD113;

    public String identify() {
        return "HelperBeanE113";
    }
}
