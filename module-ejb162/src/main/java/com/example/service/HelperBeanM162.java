package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM162 {

    @EJB
    private HelperBeanL162 helperBeanL162;

    public String identify() {
        return "HelperBeanM162";
    }
}
