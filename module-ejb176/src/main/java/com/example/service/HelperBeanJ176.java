package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ176 {

    @EJB
    private HelperBeanI176 helperBeanI176;

    public String identify() {
        return "HelperBeanJ176";
    }
}
