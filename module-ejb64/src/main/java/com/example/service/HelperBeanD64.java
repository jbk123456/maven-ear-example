package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD64 {

    @EJB
    private HelperBeanC64 helperBeanC64;

    public String identify() {
        return "HelperBeanD64";
    }
}
