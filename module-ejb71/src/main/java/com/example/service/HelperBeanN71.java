package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN71 {

    @EJB
    private HelperBeanM71 helperBeanM71;

    public String identify() {
        return "HelperBeanN71";
    }
}
