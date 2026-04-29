package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB156 {

    @EJB
    private HelperBeanA156 helperBeanA156;

    public String identify() {
        return "HelperBeanB156";
    }
}
