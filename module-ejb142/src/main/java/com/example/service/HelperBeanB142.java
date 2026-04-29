package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB142 {

    @EJB
    private HelperBeanA142 helperBeanA142;

    public String identify() {
        return "HelperBeanB142";
    }
}
