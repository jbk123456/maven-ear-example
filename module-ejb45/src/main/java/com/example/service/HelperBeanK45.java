package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK45 {

    @EJB
    private HelperBeanJ45 helperBeanJ45;

    public String identify() {
        return "HelperBeanK45";
    }
}
