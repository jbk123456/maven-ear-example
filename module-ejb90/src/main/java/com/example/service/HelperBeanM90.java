package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM90 {

    @EJB
    private HelperBeanL90 helperBeanL90;

    public String identify() {
        return "HelperBeanM90";
    }
}
