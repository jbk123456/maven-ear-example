package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM9 {

    @EJB
    private HelperBeanL9 helperBeanL9;

    public String identify() {
        return "HelperBeanM9";
    }
}
