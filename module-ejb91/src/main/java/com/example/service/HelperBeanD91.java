package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD91 {

    @EJB
    private HelperBeanC91 helperBeanC91;

    public String identify() {
        return "HelperBeanD91";
    }
}
