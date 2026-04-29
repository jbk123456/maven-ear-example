package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB66 {

    @EJB
    private HelperBeanA66 helperBeanA66;

    public String identify() {
        return "HelperBeanB66";
    }
}
