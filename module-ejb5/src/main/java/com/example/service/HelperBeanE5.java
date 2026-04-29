package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE5 {

    @EJB
    private HelperBeanD5 helperBeanD5;

    public String identify() {
        return "HelperBeanE5";
    }
}
