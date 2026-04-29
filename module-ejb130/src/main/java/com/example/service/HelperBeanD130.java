package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD130 {

    @EJB
    private HelperBeanC130 helperBeanC130;

    public String identify() {
        return "HelperBeanD130";
    }
}
