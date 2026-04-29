package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD90 {

    @EJB
    private HelperBeanC90 helperBeanC90;

    public String identify() {
        return "HelperBeanD90";
    }
}
