package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD73 {

    @EJB
    private HelperBeanC73 helperBeanC73;

    public String identify() {
        return "HelperBeanD73";
    }
}
