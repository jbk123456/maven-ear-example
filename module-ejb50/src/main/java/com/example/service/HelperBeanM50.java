package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM50 {

    @EJB
    private HelperBeanL50 helperBeanL50;

    public String identify() {
        return "HelperBeanM50";
    }
}
