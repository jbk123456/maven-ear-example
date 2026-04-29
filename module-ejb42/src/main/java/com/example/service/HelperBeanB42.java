package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB42 {

    @EJB
    private HelperBeanA42 helperBeanA42;

    public String identify() {
        return "HelperBeanB42";
    }
}
