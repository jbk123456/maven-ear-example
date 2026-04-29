package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO27 {

    @EJB
    private HelperBeanN27 helperBeanN27;

    public String identify() {
        return "HelperBeanO27";
    }
}
