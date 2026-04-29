package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE81 {

    @EJB
    private HelperBeanD81 helperBeanD81;

    public String identify() {
        return "HelperBeanE81";
    }
}
