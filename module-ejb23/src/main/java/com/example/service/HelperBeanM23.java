package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM23 {

    @EJB
    private HelperBeanL23 helperBeanL23;

    public String identify() {
        return "HelperBeanM23";
    }
}
