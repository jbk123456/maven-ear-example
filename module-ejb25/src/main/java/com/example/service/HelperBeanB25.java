package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB25 {

    @EJB
    private HelperBeanA25 helperBeanA25;

    public String identify() {
        return "HelperBeanB25";
    }
}
