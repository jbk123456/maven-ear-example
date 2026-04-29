package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN27 {

    @EJB
    private HelperBeanM27 helperBeanM27;

    public String identify() {
        return "HelperBeanN27";
    }
}
