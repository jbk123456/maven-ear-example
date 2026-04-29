package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM4 {

    @EJB
    private HelperBeanL4 helperBeanL4;

    public String identify() {
        return "HelperBeanM4";
    }
}
