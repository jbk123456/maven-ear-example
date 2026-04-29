package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC123 {

    @EJB
    private HelperBeanB123 helperBeanB123;

    public String identify() {
        return "HelperBeanC123";
    }
}
