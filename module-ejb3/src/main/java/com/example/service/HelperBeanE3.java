package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE3 {

    @EJB
    private HelperBeanD3 helperBeanD3;

    public String identify() {
        return "HelperBeanE3";
    }
}
