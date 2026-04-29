package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM107 {

    @EJB
    private HelperBeanL107 helperBeanL107;

    public String identify() {
        return "HelperBeanM107";
    }
}
