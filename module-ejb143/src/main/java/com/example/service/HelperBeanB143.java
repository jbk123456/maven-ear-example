package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB143 {

    @EJB
    private HelperBeanA143 helperBeanA143;

    public String identify() {
        return "HelperBeanB143";
    }
}
