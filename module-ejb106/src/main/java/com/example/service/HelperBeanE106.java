package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE106 {

    @EJB
    private HelperBeanD106 helperBeanD106;

    public String identify() {
        return "HelperBeanE106";
    }
}
