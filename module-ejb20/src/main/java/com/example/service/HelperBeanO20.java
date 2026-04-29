package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO20 {

    @EJB
    private HelperBeanN20 helperBeanN20;

    public String identify() {
        return "HelperBeanO20";
    }
}
