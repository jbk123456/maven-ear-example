package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB176 {

    @EJB
    private HelperBeanA176 helperBeanA176;

    public String identify() {
        return "HelperBeanB176";
    }
}
