package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE4 {

    @EJB
    private HelperBeanD4 helperBeanD4;

    public String identify() {
        return "HelperBeanE4";
    }
}
