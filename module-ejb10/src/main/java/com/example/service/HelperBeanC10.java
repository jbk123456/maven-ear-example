package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC10 {

    @EJB
    private HelperBeanB10 helperBeanB10;

    public String identify() {
        return "HelperBeanC10";
    }
}
