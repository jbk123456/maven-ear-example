package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM52 {

    @EJB
    private HelperBeanL52 helperBeanL52;

    public String identify() {
        return "HelperBeanM52";
    }
}
