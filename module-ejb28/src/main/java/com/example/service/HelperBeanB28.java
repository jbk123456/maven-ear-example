package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB28 {

    @EJB
    private HelperBeanA28 helperBeanA28;

    public String identify() {
        return "HelperBeanB28";
    }
}
