package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE41 {

    @EJB
    private HelperBeanD41 helperBeanD41;

    public String identify() {
        return "HelperBeanE41";
    }
}
