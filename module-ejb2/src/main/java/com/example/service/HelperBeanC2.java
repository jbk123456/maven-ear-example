package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC2 {

    @EJB
    private HelperBeanB2 helperBeanB2;

    public String identify() {
        return "HelperBeanC2";
    }
}
