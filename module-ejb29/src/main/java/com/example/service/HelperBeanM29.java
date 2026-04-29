package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM29 {

    @EJB
    private HelperBeanL29 helperBeanL29;

    public String identify() {
        return "HelperBeanM29";
    }
}
