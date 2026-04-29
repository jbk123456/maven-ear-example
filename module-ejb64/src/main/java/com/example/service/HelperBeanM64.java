package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM64 {

    @EJB
    private HelperBeanL64 helperBeanL64;

    public String identify() {
        return "HelperBeanM64";
    }
}
