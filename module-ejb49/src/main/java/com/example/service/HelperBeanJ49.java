package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ49 {

    @EJB
    private HelperBeanI49 helperBeanI49;

    public String identify() {
        return "HelperBeanJ49";
    }
}
