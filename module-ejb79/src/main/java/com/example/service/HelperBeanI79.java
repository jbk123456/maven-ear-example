package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI79 {

    @EJB
    private HelperBeanH79 helperBeanH79;

    public String identify() {
        return "HelperBeanI79";
    }
}
