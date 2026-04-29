package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE148 {

    @EJB
    private HelperBeanD148 helperBeanD148;

    public String identify() {
        return "HelperBeanE148";
    }
}
