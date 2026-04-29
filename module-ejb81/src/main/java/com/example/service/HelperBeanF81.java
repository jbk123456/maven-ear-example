package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF81 {

    @EJB
    private HelperBeanE81 helperBeanE81;

    public String identify() {
        return "HelperBeanF81";
    }
}
