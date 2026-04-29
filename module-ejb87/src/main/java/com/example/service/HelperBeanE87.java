package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE87 {

    @EJB
    private HelperBeanD87 helperBeanD87;

    public String identify() {
        return "HelperBeanE87";
    }
}
