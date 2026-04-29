package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC37 {

    @EJB
    private HelperBeanB37 helperBeanB37;

    public String identify() {
        return "HelperBeanC37";
    }
}
