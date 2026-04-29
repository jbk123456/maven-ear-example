package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI133 {

    @EJB
    private HelperBeanH133 helperBeanH133;

    public String identify() {
        return "HelperBeanI133";
    }
}
