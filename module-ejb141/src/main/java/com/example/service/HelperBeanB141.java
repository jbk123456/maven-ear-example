package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB141 {

    @EJB
    private HelperBeanA141 helperBeanA141;

    public String identify() {
        return "HelperBeanB141";
    }
}
