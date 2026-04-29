package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC141 {

    @EJB
    private HelperBeanB141 helperBeanB141;

    public String identify() {
        return "HelperBeanC141";
    }
}
