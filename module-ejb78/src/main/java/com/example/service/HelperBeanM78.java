package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM78 {

    @EJB
    private HelperBeanL78 helperBeanL78;

    public String identify() {
        return "HelperBeanM78";
    }
}
