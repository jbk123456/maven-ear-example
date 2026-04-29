package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE99 {

    @EJB
    private HelperBeanD99 helperBeanD99;

    public String identify() {
        return "HelperBeanE99";
    }
}
