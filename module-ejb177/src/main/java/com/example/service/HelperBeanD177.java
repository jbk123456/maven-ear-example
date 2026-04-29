package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD177 {

    @EJB
    private HelperBeanC177 helperBeanC177;

    public String identify() {
        return "HelperBeanD177";
    }
}
