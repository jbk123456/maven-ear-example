package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE9 {

    @EJB
    private HelperBeanD9 helperBeanD9;

    public String identify() {
        return "HelperBeanE9";
    }
}
