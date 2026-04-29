package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM31 {

    @EJB
    private HelperBeanL31 helperBeanL31;

    public String identify() {
        return "HelperBeanM31";
    }
}
