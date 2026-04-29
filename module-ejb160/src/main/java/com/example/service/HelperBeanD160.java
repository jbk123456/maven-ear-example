package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD160 {

    @EJB
    private HelperBeanC160 helperBeanC160;

    public String identify() {
        return "HelperBeanD160";
    }
}
