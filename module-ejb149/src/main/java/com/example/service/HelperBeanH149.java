package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH149 {

    @EJB
    private HelperBeanG149 helperBeanG149;

    public String identify() {
        return "HelperBeanH149";
    }
}
