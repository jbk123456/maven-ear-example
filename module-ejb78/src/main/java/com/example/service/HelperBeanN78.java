package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN78 {

    @EJB
    private HelperBeanM78 helperBeanM78;

    public String identify() {
        return "HelperBeanN78";
    }
}
