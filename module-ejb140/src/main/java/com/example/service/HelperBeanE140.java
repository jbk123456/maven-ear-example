package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE140 {

    @EJB
    private HelperBeanD140 helperBeanD140;

    public String identify() {
        return "HelperBeanE140";
    }
}
