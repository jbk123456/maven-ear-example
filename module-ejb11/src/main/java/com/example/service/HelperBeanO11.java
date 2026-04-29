package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO11 {

    @EJB
    private HelperBeanN11 helperBeanN11;

    public String identify() {
        return "HelperBeanO11";
    }
}
