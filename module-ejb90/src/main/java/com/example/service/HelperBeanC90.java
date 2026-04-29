package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC90 {

    @EJB
    private HelperBeanB90 helperBeanB90;

    public String identify() {
        return "HelperBeanC90";
    }
}
