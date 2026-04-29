package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH49 {

    @EJB
    private HelperBeanG49 helperBeanG49;

    public String identify() {
        return "HelperBeanH49";
    }
}
