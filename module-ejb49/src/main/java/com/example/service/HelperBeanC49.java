package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC49 {

    @EJB
    private HelperBeanB49 helperBeanB49;

    public String identify() {
        return "HelperBeanC49";
    }
}
