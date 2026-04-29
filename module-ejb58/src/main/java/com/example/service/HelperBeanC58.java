package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC58 {

    @EJB
    private HelperBeanB58 helperBeanB58;

    public String identify() {
        return "HelperBeanC58";
    }
}
