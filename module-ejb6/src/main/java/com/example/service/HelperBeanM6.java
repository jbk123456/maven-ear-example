package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM6 {

    @EJB
    private HelperBeanL6 helperBeanL6;

    public String identify() {
        return "HelperBeanM6";
    }
}
