package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE28 {

    @EJB
    private HelperBeanD28 helperBeanD28;

    public String identify() {
        return "HelperBeanE28";
    }
}
