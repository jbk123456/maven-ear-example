package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM71 {

    @EJB
    private HelperBeanL71 helperBeanL71;

    public String identify() {
        return "HelperBeanM71";
    }
}
