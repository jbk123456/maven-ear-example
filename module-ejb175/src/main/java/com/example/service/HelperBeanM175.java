package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM175 {

    @EJB
    private HelperBeanL175 helperBeanL175;

    public String identify() {
        return "HelperBeanM175";
    }
}
