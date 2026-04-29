package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD31 {

    @EJB
    private HelperBeanC31 helperBeanC31;

    public String identify() {
        return "HelperBeanD31";
    }
}
