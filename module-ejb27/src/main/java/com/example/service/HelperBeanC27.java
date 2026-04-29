package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC27 {

    @EJB
    private HelperBeanB27 helperBeanB27;

    public String identify() {
        return "HelperBeanC27";
    }
}
