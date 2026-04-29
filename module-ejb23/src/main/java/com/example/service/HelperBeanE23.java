package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE23 {

    @EJB
    private HelperBeanD23 helperBeanD23;

    public String identify() {
        return "HelperBeanE23";
    }
}
