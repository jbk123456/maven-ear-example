package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF133 {

    @EJB
    private HelperBeanE133 helperBeanE133;

    public String identify() {
        return "HelperBeanF133";
    }
}
