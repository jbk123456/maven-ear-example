package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM22 {

    @EJB
    private HelperBeanL22 helperBeanL22;

    public String identify() {
        return "HelperBeanM22";
    }
}
