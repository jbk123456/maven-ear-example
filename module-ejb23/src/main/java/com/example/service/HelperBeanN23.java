package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN23 {

    @EJB
    private HelperBeanM23 helperBeanM23;

    public String identify() {
        return "HelperBeanN23";
    }
}
