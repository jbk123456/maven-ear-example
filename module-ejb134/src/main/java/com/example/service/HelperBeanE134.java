package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE134 {

    @EJB
    private HelperBeanD134 helperBeanD134;

    public String identify() {
        return "HelperBeanE134";
    }
}
