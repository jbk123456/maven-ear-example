package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC57 {

    @EJB
    private HelperBeanB57 helperBeanB57;

    public String identify() {
        return "HelperBeanC57";
    }
}
