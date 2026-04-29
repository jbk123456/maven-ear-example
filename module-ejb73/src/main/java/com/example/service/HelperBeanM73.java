package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM73 {

    @EJB
    private HelperBeanL73 helperBeanL73;

    public String identify() {
        return "HelperBeanM73";
    }
}
