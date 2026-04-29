package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD99 {

    @EJB
    private HelperBeanC99 helperBeanC99;

    public String identify() {
        return "HelperBeanD99";
    }
}
