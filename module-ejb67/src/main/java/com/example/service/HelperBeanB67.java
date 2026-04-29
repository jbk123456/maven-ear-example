package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB67 {

    @EJB
    private HelperBeanA67 helperBeanA67;

    public String identify() {
        return "HelperBeanB67";
    }
}
