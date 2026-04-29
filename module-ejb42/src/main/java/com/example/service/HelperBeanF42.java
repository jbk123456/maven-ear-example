package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF42 {

    @EJB
    private HelperBeanE42 helperBeanE42;

    public String identify() {
        return "HelperBeanF42";
    }
}
