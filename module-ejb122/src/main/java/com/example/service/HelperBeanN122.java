package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN122 {

    @EJB
    private HelperBeanM122 helperBeanM122;

    public String identify() {
        return "HelperBeanN122";
    }
}
