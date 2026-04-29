package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE133 {

    @EJB
    private HelperBeanD133 helperBeanD133;

    public String identify() {
        return "HelperBeanE133";
    }
}
