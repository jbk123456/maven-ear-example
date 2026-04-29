package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC102 {

    @EJB
    private HelperBeanB102 helperBeanB102;

    public String identify() {
        return "HelperBeanC102";
    }
}
