package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC148 {

    @EJB
    private HelperBeanB148 helperBeanB148;

    public String identify() {
        return "HelperBeanC148";
    }
}
