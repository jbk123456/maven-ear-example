package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE75 {

    @EJB
    private HelperBeanD75 helperBeanD75;

    public String identify() {
        return "HelperBeanE75";
    }
}
