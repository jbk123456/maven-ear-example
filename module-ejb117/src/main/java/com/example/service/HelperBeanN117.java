package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN117 {

    @EJB
    private HelperBeanM117 helperBeanM117;

    public String identify() {
        return "HelperBeanN117";
    }
}
