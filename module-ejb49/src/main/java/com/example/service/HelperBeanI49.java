package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI49 {

    @EJB
    private HelperBeanH49 helperBeanH49;

    public String identify() {
        return "HelperBeanI49";
    }
}
