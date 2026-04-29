package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF4 {

    @EJB
    private HelperBeanE4 helperBeanE4;

    public String identify() {
        return "HelperBeanF4";
    }
}
