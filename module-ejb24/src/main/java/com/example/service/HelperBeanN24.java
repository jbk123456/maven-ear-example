package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN24 {

    @EJB
    private HelperBeanM24 helperBeanM24;

    public String identify() {
        return "HelperBeanN24";
    }
}
