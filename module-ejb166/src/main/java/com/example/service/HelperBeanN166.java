package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN166 {

    @EJB
    private HelperBeanM166 helperBeanM166;

    public String identify() {
        return "HelperBeanN166";
    }
}
