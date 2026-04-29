package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI177 {

    @EJB
    private HelperBeanH177 helperBeanH177;

    public String identify() {
        return "HelperBeanI177";
    }
}
