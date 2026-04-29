package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC122 {

    @EJB
    private HelperBeanB122 helperBeanB122;

    public String identify() {
        return "HelperBeanC122";
    }
}
