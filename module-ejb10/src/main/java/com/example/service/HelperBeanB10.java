package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB10 {

    @EJB
    private HelperBeanA10 helperBeanA10;

    public String identify() {
        return "HelperBeanB10";
    }
}
