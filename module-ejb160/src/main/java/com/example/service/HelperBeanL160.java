package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL160 {

    @EJB
    private HelperBeanK160 helperBeanK160;

    public String identify() {
        return "HelperBeanL160";
    }
}
