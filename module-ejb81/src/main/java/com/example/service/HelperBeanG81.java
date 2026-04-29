package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG81 {

    @EJB
    private HelperBeanF81 helperBeanF81;

    public String identify() {
        return "HelperBeanG81";
    }
}
