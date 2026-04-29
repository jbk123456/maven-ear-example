package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN63 {

    @EJB
    private HelperBeanM63 helperBeanM63;

    public String identify() {
        return "HelperBeanN63";
    }
}
