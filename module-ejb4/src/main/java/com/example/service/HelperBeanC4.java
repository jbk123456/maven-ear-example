package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC4 {

    @EJB
    private HelperBeanB4 helperBeanB4;

    public String identify() {
        return "HelperBeanC4";
    }
}
