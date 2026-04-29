package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF113 {

    @EJB
    private HelperBeanE113 helperBeanE113;

    public String identify() {
        return "HelperBeanF113";
    }
}
