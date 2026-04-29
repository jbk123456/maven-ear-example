package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM7 {

    @EJB
    private HelperBeanL7 helperBeanL7;

    public String identify() {
        return "HelperBeanM7";
    }
}
