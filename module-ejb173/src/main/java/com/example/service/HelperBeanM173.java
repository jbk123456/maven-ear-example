package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM173 {

    @EJB
    private HelperBeanL173 helperBeanL173;

    public String identify() {
        return "HelperBeanM173";
    }
}
