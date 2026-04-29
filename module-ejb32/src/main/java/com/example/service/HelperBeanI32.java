package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI32 {

    @EJB
    private HelperBeanH32 helperBeanH32;

    public String identify() {
        return "HelperBeanI32";
    }
}
