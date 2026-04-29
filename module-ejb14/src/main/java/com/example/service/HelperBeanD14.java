package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD14 {

    @EJB
    private HelperBeanC14 helperBeanC14;

    public String identify() {
        return "HelperBeanD14";
    }
}
