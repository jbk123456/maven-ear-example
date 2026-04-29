package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD157 {

    @EJB
    private HelperBeanC157 helperBeanC157;

    public String identify() {
        return "HelperBeanD157";
    }
}
