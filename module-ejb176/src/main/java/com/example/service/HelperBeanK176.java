package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK176 {

    @EJB
    private HelperBeanJ176 helperBeanJ176;

    public String identify() {
        return "HelperBeanK176";
    }
}
