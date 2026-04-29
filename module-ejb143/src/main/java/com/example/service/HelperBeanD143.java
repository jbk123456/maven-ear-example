package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD143 {

    @EJB
    private HelperBeanC143 helperBeanC143;

    public String identify() {
        return "HelperBeanD143";
    }
}
