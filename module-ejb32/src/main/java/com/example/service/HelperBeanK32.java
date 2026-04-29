package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK32 {

    @EJB
    private HelperBeanJ32 helperBeanJ32;

    public String identify() {
        return "HelperBeanK32";
    }
}
