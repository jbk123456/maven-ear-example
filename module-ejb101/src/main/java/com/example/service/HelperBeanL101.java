package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL101 {

    @EJB
    private HelperBeanK101 helperBeanK101;

    public String identify() {
        return "HelperBeanL101";
    }
}
