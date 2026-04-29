package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC169 {

    @EJB
    private HelperBeanB169 helperBeanB169;

    public String identify() {
        return "HelperBeanC169";
    }
}
