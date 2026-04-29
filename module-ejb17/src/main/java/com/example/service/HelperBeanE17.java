package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE17 {

    @EJB
    private HelperBeanD17 helperBeanD17;

    public String identify() {
        return "HelperBeanE17";
    }
}
