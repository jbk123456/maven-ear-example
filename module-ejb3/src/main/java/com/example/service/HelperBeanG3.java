package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG3 {

    @EJB
    private HelperBeanF3 helperBeanF3;

    public String identify() {
        return "HelperBeanG3";
    }
}
