package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG4 {

    @EJB
    private HelperBeanF4 helperBeanF4;

    public String identify() {
        return "HelperBeanG4";
    }
}
