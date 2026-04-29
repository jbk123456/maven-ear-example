package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE6 {

    @EJB
    private HelperBeanD6 helperBeanD6;

    public String identify() {
        return "HelperBeanE6";
    }
}
