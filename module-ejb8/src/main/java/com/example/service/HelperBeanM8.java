package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM8 {

    @EJB
    private HelperBeanL8 helperBeanL8;

    public String identify() {
        return "HelperBeanM8";
    }
}
