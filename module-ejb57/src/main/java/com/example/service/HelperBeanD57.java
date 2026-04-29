package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD57 {

    @EJB
    private HelperBeanC57 helperBeanC57;

    public String identify() {
        return "HelperBeanD57";
    }
}
