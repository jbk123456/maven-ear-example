package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB96 {

    @EJB
    private HelperBeanA96 helperBeanA96;

    public String identify() {
        return "HelperBeanB96";
    }
}
