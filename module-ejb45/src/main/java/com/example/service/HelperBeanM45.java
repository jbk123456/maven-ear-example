package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM45 {

    @EJB
    private HelperBeanL45 helperBeanL45;

    public String identify() {
        return "HelperBeanM45";
    }
}
