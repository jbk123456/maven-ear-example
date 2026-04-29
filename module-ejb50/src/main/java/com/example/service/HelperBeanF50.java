package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF50 {

    @EJB
    private HelperBeanE50 helperBeanE50;

    public String identify() {
        return "HelperBeanF50";
    }
}
