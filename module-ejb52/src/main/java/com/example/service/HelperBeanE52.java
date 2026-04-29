package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE52 {

    @EJB
    private HelperBeanD52 helperBeanD52;

    public String identify() {
        return "HelperBeanE52";
    }
}
