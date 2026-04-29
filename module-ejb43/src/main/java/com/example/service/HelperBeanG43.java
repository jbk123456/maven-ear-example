package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG43 {

    @EJB
    private HelperBeanF43 helperBeanF43;

    public String identify() {
        return "HelperBeanG43";
    }
}
