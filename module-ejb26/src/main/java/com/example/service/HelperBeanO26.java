package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO26 {

    @EJB
    private HelperBeanN26 helperBeanN26;

    public String identify() {
        return "HelperBeanO26";
    }
}
