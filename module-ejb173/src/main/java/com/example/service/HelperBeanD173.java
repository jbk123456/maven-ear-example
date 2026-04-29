package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD173 {

    @EJB
    private HelperBeanC173 helperBeanC173;

    public String identify() {
        return "HelperBeanD173";
    }
}
