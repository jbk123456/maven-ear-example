package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG133 {

    @EJB
    private HelperBeanF133 helperBeanF133;

    public String identify() {
        return "HelperBeanG133";
    }
}
