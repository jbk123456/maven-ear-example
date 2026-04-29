package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG6 {

    @EJB
    private HelperBeanF6 helperBeanF6;

    public String identify() {
        return "HelperBeanG6";
    }
}
