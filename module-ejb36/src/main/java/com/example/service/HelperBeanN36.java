package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN36 {

    @EJB
    private HelperBeanM36 helperBeanM36;

    public String identify() {
        return "HelperBeanN36";
    }
}
