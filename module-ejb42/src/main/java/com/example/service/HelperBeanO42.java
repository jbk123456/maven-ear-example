package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO42 {

    @EJB
    private HelperBeanN42 helperBeanN42;

    public String identify() {
        return "HelperBeanO42";
    }
}
