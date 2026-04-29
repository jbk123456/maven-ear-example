package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB69 {

    @EJB
    private HelperBeanA69 helperBeanA69;

    public String identify() {
        return "HelperBeanB69";
    }
}
