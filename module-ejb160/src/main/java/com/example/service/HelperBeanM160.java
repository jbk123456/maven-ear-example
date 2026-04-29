package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM160 {

    @EJB
    private HelperBeanL160 helperBeanL160;

    public String identify() {
        return "HelperBeanM160";
    }
}
