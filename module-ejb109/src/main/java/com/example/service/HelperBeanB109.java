package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB109 {

    @EJB
    private HelperBeanA109 helperBeanA109;

    public String identify() {
        return "HelperBeanB109";
    }
}
