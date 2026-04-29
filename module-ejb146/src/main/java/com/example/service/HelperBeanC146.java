package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC146 {

    @EJB
    private HelperBeanB146 helperBeanB146;

    public String identify() {
        return "HelperBeanC146";
    }
}
