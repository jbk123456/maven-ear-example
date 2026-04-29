package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL106 {

    @EJB
    private HelperBeanK106 helperBeanK106;

    public String identify() {
        return "HelperBeanL106";
    }
}
