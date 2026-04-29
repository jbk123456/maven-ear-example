package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB164 {

    @EJB
    private HelperBeanA164 helperBeanA164;

    public String identify() {
        return "HelperBeanB164";
    }
}
