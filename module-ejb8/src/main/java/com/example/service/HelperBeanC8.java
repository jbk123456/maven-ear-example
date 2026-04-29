package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC8 {

    @EJB
    private HelperBeanB8 helperBeanB8;

    public String identify() {
        return "HelperBeanC8";
    }
}
