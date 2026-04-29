package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN165 {

    @EJB
    private HelperBeanM165 helperBeanM165;

    public String identify() {
        return "HelperBeanN165";
    }
}
