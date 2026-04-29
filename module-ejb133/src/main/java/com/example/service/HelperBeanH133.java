package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH133 {

    @EJB
    private HelperBeanG133 helperBeanG133;

    public String identify() {
        return "HelperBeanH133";
    }
}
