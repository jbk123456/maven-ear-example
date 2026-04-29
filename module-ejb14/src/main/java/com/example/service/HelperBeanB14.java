package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB14 {

    @EJB
    private HelperBeanA14 helperBeanA14;

    public String identify() {
        return "HelperBeanB14";
    }
}
