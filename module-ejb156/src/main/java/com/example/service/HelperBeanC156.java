package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC156 {

    @EJB
    private HelperBeanB156 helperBeanB156;

    public String identify() {
        return "HelperBeanC156";
    }
}
