package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB174 {

    @EJB
    private HelperBeanA174 helperBeanA174;

    public String identify() {
        return "HelperBeanB174";
    }
}
