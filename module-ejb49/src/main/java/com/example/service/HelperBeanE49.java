package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE49 {

    @EJB
    private HelperBeanD49 helperBeanD49;

    public String identify() {
        return "HelperBeanE49";
    }
}
