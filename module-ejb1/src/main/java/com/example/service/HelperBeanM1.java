package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM1 {

    @EJB
    private HelperBeanL1 helperBeanL1;

    public String identify() {
        return "HelperBeanM1";
    }
}
