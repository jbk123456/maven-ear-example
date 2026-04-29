package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM177 {

    @EJB
    private HelperBeanL177 helperBeanL177;

    public String identify() {
        return "HelperBeanM177";
    }
}
