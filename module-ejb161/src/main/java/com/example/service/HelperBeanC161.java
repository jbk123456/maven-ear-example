package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC161 {

    @EJB
    private HelperBeanB161 helperBeanB161;

    public String identify() {
        return "HelperBeanC161";
    }
}
