package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM85 {

    @EJB
    private HelperBeanL85 helperBeanL85;

    public String identify() {
        return "HelperBeanM85";
    }
}
