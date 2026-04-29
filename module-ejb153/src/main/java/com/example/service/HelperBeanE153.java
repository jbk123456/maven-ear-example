package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE153 {

    @EJB
    private HelperBeanD153 helperBeanD153;

    public String identify() {
        return "HelperBeanE153";
    }
}
