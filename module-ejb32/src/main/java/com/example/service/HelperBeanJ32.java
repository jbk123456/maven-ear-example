package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ32 {

    @EJB
    private HelperBeanI32 helperBeanI32;

    public String identify() {
        return "HelperBeanJ32";
    }
}
