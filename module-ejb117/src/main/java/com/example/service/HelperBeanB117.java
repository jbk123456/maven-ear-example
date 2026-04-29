package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB117 {

    @EJB
    private HelperBeanA117 helperBeanA117;

    public String identify() {
        return "HelperBeanB117";
    }
}
