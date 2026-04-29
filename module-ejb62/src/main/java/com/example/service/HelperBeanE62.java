package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE62 {

    @EJB
    private HelperBeanD62 helperBeanD62;

    public String identify() {
        return "HelperBeanE62";
    }
}
