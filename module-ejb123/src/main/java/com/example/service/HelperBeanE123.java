package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE123 {

    @EJB
    private HelperBeanD123 helperBeanD123;

    public String identify() {
        return "HelperBeanE123";
    }
}
