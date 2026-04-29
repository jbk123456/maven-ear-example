package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE24 {

    @EJB
    private HelperBeanD24 helperBeanD24;

    public String identify() {
        return "HelperBeanE24";
    }
}
