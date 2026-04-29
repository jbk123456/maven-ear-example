package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE58 {

    @EJB
    private HelperBeanD58 helperBeanD58;

    public String identify() {
        return "HelperBeanE58";
    }
}
