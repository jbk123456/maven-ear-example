package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN79 {

    @EJB
    private HelperBeanM79 helperBeanM79;

    public String identify() {
        return "HelperBeanN79";
    }
}
