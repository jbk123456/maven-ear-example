package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE90 {

    @EJB
    private HelperBeanD90 helperBeanD90;

    public String identify() {
        return "HelperBeanE90";
    }
}
