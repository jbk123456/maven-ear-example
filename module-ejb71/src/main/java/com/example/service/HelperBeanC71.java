package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC71 {

    @EJB
    private HelperBeanB71 helperBeanB71;

    public String identify() {
        return "HelperBeanC71";
    }
}
