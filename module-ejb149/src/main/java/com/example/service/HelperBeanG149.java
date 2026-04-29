package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG149 {

    @EJB
    private HelperBeanF149 helperBeanF149;

    public String identify() {
        return "HelperBeanG149";
    }
}
