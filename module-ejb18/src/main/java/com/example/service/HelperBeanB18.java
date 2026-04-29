package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB18 {

    @EJB
    private HelperBeanA18 helperBeanA18;

    public String identify() {
        return "HelperBeanB18";
    }
}
