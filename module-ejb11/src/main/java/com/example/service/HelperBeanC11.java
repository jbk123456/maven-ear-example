package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC11 {

    @EJB
    private HelperBeanB11 helperBeanB11;

    public String identify() {
        return "HelperBeanC11";
    }
}
