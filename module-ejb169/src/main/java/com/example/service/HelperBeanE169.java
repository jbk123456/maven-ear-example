package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE169 {

    @EJB
    private HelperBeanD169 helperBeanD169;

    public String identify() {
        return "HelperBeanE169";
    }
}
