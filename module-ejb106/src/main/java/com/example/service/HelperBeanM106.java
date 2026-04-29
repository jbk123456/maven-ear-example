package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM106 {

    @EJB
    private HelperBeanL106 helperBeanL106;

    public String identify() {
        return "HelperBeanM106";
    }
}
