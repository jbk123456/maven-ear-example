package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF20 {

    @EJB
    private HelperBeanE20 helperBeanE20;

    public String identify() {
        return "HelperBeanF20";
    }
}
