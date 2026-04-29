package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC100 {

    @EJB
    private HelperBeanB100 helperBeanB100;

    public String identify() {
        return "HelperBeanC100";
    }
}
