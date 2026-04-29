package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC12 {

    @EJB
    private HelperBeanB12 helperBeanB12;

    public String identify() {
        return "HelperBeanC12";
    }
}
