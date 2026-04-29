package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN73 {

    @EJB
    private HelperBeanM73 helperBeanM73;

    public String identify() {
        return "HelperBeanN73";
    }
}
