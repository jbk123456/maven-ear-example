package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC62 {

    @EJB
    private HelperBeanB62 helperBeanB62;

    public String identify() {
        return "HelperBeanC62";
    }
}
