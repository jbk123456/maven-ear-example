package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD127 {

    @EJB
    private HelperBeanC127 helperBeanC127;

    public String identify() {
        return "HelperBeanD127";
    }
}
