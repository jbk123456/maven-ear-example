package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM176 {

    @EJB
    private HelperBeanL176 helperBeanL176;

    public String identify() {
        return "HelperBeanM176";
    }
}
