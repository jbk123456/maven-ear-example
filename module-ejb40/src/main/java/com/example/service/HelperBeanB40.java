package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB40 {

    @EJB
    private HelperBeanA40 helperBeanA40;

    public String identify() {
        return "HelperBeanB40";
    }
}
