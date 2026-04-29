package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN102 {

    @EJB
    private HelperBeanM102 helperBeanM102;

    public String identify() {
        return "HelperBeanN102";
    }
}
