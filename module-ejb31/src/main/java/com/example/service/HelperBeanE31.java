package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE31 {

    @EJB
    private HelperBeanD31 helperBeanD31;

    public String identify() {
        return "HelperBeanE31";
    }
}
