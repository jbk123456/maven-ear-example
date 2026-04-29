package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD45 {

    @EJB
    private HelperBeanC45 helperBeanC45;

    public String identify() {
        return "HelperBeanD45";
    }
}
