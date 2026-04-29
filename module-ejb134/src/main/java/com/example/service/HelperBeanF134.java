package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF134 {

    @EJB
    private HelperBeanE134 helperBeanE134;

    public String identify() {
        return "HelperBeanF134";
    }
}
