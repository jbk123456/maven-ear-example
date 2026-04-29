package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM18 {

    @EJB
    private HelperBeanL18 helperBeanL18;

    public String identify() {
        return "HelperBeanM18";
    }
}
