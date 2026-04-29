package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG145 {

    @EJB
    private HelperBeanF145 helperBeanF145;

    public String identify() {
        return "HelperBeanG145";
    }
}
