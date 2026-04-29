package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC134 {

    @EJB
    private HelperBeanB134 helperBeanB134;

    public String identify() {
        return "HelperBeanC134";
    }
}
