package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB9 {

    @EJB
    private HelperBeanA9 helperBeanA9;

    public String identify() {
        return "HelperBeanB9";
    }
}
