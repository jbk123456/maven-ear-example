package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD110 {

    @EJB
    private HelperBeanC110 helperBeanC110;

    public String identify() {
        return "HelperBeanD110";
    }
}
