package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM3 {

    @EJB
    private HelperBeanL3 helperBeanL3;

    public String identify() {
        return "HelperBeanM3";
    }
}
