package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ45 {

    @EJB
    private HelperBeanI45 helperBeanI45;

    public String identify() {
        return "HelperBeanJ45";
    }
}
