package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC53 {

    @EJB
    private HelperBeanB53 helperBeanB53;

    public String identify() {
        return "HelperBeanC53";
    }
}
