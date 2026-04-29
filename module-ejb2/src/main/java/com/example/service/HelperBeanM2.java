package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM2 {

    @EJB
    private HelperBeanL2 helperBeanL2;

    public String identify() {
        return "HelperBeanM2";
    }
}
