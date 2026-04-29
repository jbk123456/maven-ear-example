package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC132 {

    @EJB
    private HelperBeanB132 helperBeanB132;

    public String identify() {
        return "HelperBeanC132";
    }
}
