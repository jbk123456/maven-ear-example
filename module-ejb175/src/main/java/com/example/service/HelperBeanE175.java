package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE175 {

    @EJB
    private HelperBeanD175 helperBeanD175;

    public String identify() {
        return "HelperBeanE175";
    }
}
