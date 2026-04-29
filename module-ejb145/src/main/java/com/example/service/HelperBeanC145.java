package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC145 {

    @EJB
    private HelperBeanB145 helperBeanB145;

    public String identify() {
        return "HelperBeanC145";
    }
}
