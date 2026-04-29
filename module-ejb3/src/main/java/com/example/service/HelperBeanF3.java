package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF3 {

    @EJB
    private HelperBeanE3 helperBeanE3;

    public String identify() {
        return "HelperBeanF3";
    }
}
