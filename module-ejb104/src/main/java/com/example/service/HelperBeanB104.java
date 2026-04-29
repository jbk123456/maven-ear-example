package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB104 {

    @EJB
    private HelperBeanA104 helperBeanA104;

    public String identify() {
        return "HelperBeanB104";
    }
}
