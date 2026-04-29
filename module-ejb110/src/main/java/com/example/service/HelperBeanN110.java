package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN110 {

    @EJB
    private HelperBeanM110 helperBeanM110;

    public String identify() {
        return "HelperBeanN110";
    }
}
