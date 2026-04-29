package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC28 {

    @EJB
    private HelperBeanB28 helperBeanB28;

    public String identify() {
        return "HelperBeanC28";
    }
}
