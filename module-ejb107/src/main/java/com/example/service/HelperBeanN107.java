package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN107 {

    @EJB
    private HelperBeanM107 helperBeanM107;

    public String identify() {
        return "HelperBeanN107";
    }
}
