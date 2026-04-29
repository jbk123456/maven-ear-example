package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC20 {

    @EJB
    private HelperBeanB20 helperBeanB20;

    public String identify() {
        return "HelperBeanC20";
    }
}
