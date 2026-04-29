package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE1 {

    @EJB
    private HelperBeanD1 helperBeanD1;

    public String identify() {
        return "HelperBeanE1";
    }
}
