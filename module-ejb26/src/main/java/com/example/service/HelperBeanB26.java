package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB26 {

    @EJB
    private HelperBeanA26 helperBeanA26;

    public String identify() {
        return "HelperBeanB26";
    }
}
