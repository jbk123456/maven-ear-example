package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE32 {

    @EJB
    private HelperBeanD32 helperBeanD32;

    public String identify() {
        return "HelperBeanE32";
    }
}
