package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD18 {

    @EJB
    private HelperBeanC18 helperBeanC18;

    public String identify() {
        return "HelperBeanD18";
    }
}
