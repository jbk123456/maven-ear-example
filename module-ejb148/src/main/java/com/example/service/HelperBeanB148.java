package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB148 {

    @EJB
    private HelperBeanA148 helperBeanA148;

    public String identify() {
        return "HelperBeanB148";
    }
}
