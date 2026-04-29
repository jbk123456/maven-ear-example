package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN106 {

    @EJB
    private HelperBeanM106 helperBeanM106;

    public String identify() {
        return "HelperBeanN106";
    }
}
