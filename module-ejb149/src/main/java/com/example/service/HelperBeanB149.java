package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB149 {

    @EJB
    private HelperBeanA149 helperBeanA149;

    public String identify() {
        return "HelperBeanB149";
    }
}
