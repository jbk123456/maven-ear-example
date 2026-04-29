package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC29 {

    @EJB
    private HelperBeanB29 helperBeanB29;

    public String identify() {
        return "HelperBeanC29";
    }
}
