package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM166 {

    @EJB
    private HelperBeanL166 helperBeanL166;

    public String identify() {
        return "HelperBeanM166";
    }
}
