package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC17 {

    @EJB
    private HelperBeanB17 helperBeanB17;

    public String identify() {
        return "HelperBeanC17";
    }
}
