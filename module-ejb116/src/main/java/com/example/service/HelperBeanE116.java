package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE116 {

    @EJB
    private HelperBeanD116 helperBeanD116;

    public String identify() {
        return "HelperBeanE116";
    }
}
