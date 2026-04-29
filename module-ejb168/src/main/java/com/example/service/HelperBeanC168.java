package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC168 {

    @EJB
    private HelperBeanB168 helperBeanB168;

    public String identify() {
        return "HelperBeanC168";
    }
}
