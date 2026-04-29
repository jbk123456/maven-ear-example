package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB113 {

    @EJB
    private HelperBeanA113 helperBeanA113;

    public String identify() {
        return "HelperBeanB113";
    }
}
