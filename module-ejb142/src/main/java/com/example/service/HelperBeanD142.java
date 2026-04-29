package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD142 {

    @EJB
    private HelperBeanC142 helperBeanC142;

    public String identify() {
        return "HelperBeanD142";
    }
}
