package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF6 {

    @EJB
    private HelperBeanE6 helperBeanE6;

    public String identify() {
        return "HelperBeanF6";
    }
}
