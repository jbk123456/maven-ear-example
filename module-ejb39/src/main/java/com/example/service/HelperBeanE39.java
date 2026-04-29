package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE39 {

    @EJB
    private HelperBeanD39 helperBeanD39;

    public String identify() {
        return "HelperBeanE39";
    }
}
