package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC22 {

    @EJB
    private HelperBeanB22 helperBeanB22;

    public String identify() {
        return "HelperBeanC22";
    }
}
