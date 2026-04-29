package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM123 {

    @EJB
    private HelperBeanL123 helperBeanL123;

    public String identify() {
        return "HelperBeanM123";
    }
}
