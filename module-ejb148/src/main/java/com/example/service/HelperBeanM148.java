package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM148 {

    @EJB
    private HelperBeanL148 helperBeanL148;

    public String identify() {
        return "HelperBeanM148";
    }
}
