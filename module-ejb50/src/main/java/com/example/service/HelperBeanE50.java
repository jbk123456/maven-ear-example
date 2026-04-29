package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE50 {

    @EJB
    private HelperBeanD50 helperBeanD50;

    public String identify() {
        return "HelperBeanE50";
    }
}
