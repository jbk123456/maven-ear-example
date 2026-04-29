package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC91 {

    @EJB
    private HelperBeanB91 helperBeanB91;

    public String identify() {
        return "HelperBeanC91";
    }
}
