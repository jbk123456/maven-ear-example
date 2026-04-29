package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC1 {

    @EJB
    private HelperBeanB1 helperBeanB1;

    public String identify() {
        return "HelperBeanC1";
    }
}
