package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM172 {

    @EJB
    private HelperBeanL172 helperBeanL172;

    public String identify() {
        return "HelperBeanM172";
    }
}
