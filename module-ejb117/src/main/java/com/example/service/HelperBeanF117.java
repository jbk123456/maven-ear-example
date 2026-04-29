package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF117 {

    @EJB
    private HelperBeanE117 helperBeanE117;

    public String identify() {
        return "HelperBeanF117";
    }
}
