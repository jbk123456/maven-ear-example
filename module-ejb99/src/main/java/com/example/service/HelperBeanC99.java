package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC99 {

    @EJB
    private HelperBeanB99 helperBeanB99;

    public String identify() {
        return "HelperBeanC99";
    }
}
