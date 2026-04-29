package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE16 {

    @EJB
    private HelperBeanD16 helperBeanD16;

    public String identify() {
        return "HelperBeanE16";
    }
}
