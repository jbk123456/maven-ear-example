package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC92 {

    @EJB
    private HelperBeanB92 helperBeanB92;

    public String identify() {
        return "HelperBeanC92";
    }
}
