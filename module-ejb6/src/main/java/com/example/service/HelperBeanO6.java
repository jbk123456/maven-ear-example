package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO6 {

    @EJB
    private HelperBeanN6 helperBeanN6;

    public String identify() {
        return "HelperBeanO6";
    }
}
