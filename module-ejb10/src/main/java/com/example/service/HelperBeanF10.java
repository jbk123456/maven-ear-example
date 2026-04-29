package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF10 {

    @EJB
    private HelperBeanE10 helperBeanE10;

    public String identify() {
        return "HelperBeanF10";
    }
}
