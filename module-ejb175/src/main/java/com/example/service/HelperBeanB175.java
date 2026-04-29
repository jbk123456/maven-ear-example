package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB175 {

    @EJB
    private HelperBeanA175 helperBeanA175;

    public String identify() {
        return "HelperBeanB175";
    }
}
