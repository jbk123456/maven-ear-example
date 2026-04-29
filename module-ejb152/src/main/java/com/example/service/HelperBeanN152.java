package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN152 {

    @EJB
    private HelperBeanM152 helperBeanM152;

    public String identify() {
        return "HelperBeanN152";
    }
}
