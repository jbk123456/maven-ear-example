package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD49 {

    @EJB
    private HelperBeanC49 helperBeanC49;

    public String identify() {
        return "HelperBeanD49";
    }
}
