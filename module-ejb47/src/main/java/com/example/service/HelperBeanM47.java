package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM47 {

    @EJB
    private HelperBeanL47 helperBeanL47;

    public String identify() {
        return "HelperBeanM47";
    }
}
