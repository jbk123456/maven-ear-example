package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB62 {

    @EJB
    private HelperBeanA62 helperBeanA62;

    public String identify() {
        return "HelperBeanB62";
    }
}
