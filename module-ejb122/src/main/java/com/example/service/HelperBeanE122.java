package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE122 {

    @EJB
    private HelperBeanD122 helperBeanD122;

    public String identify() {
        return "HelperBeanE122";
    }
}
