package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF145 {

    @EJB
    private HelperBeanE145 helperBeanE145;

    public String identify() {
        return "HelperBeanF145";
    }
}
