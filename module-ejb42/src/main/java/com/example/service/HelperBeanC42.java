package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC42 {

    @EJB
    private HelperBeanB42 helperBeanB42;

    public String identify() {
        return "HelperBeanC42";
    }
}
