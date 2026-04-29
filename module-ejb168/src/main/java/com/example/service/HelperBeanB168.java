package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB168 {

    @EJB
    private HelperBeanA168 helperBeanA168;

    public String identify() {
        return "HelperBeanB168";
    }
}
