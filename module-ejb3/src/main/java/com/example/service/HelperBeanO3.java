package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO3 {

    @EJB
    private HelperBeanN3 helperBeanN3;

    public String identify() {
        return "HelperBeanO3";
    }
}
