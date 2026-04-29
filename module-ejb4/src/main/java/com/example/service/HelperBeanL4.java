package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL4 {

    @EJB
    private HelperBeanK4 helperBeanK4;

    public String identify() {
        return "HelperBeanL4";
    }
}
