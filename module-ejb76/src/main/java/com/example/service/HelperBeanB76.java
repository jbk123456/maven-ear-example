package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB76 {

    @EJB
    private HelperBeanA76 helperBeanA76;

    public String identify() {
        return "HelperBeanB76";
    }
}
