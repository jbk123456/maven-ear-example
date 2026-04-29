package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC79 {

    @EJB
    private HelperBeanB79 helperBeanB79;

    public String identify() {
        return "HelperBeanC79";
    }
}
