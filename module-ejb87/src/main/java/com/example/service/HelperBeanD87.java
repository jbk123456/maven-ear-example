package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD87 {

    @EJB
    private HelperBeanC87 helperBeanC87;

    public String identify() {
        return "HelperBeanD87";
    }
}
