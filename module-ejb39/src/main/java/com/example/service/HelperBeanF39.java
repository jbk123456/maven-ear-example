package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF39 {

    @EJB
    private HelperBeanE39 helperBeanE39;

    public String identify() {
        return "HelperBeanF39";
    }
}
