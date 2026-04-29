package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC128 {

    @EJB
    private HelperBeanB128 helperBeanB128;

    public String identify() {
        return "HelperBeanC128";
    }
}
