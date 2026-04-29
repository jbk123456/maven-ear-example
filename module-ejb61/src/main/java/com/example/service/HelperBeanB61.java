package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB61 {

    @EJB
    private HelperBeanA61 helperBeanA61;

    public String identify() {
        return "HelperBeanB61";
    }
}
