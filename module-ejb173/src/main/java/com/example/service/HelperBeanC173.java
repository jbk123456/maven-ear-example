package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC173 {

    @EJB
    private HelperBeanB173 helperBeanB173;

    public String identify() {
        return "HelperBeanC173";
    }
}
