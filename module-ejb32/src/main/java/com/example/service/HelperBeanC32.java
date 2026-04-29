package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC32 {

    @EJB
    private HelperBeanB32 helperBeanB32;

    public String identify() {
        return "HelperBeanC32";
    }
}
