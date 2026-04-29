package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN162 {

    @EJB
    private HelperBeanM162 helperBeanM162;

    public String identify() {
        return "HelperBeanN162";
    }
}
