package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM101 {

    @EJB
    private HelperBeanL101 helperBeanL101;

    public String identify() {
        return "HelperBeanM101";
    }
}
