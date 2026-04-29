package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM5 {

    @EJB
    private HelperBeanL5 helperBeanL5;

    public String identify() {
        return "HelperBeanM5";
    }
}
