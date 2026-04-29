package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC140 {

    @EJB
    private HelperBeanB140 helperBeanB140;

    public String identify() {
        return "HelperBeanC140";
    }
}
