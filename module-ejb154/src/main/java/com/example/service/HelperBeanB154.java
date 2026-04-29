package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB154 {

    @EJB
    private HelperBeanA154 helperBeanA154;

    public String identify() {
        return "HelperBeanB154";
    }
}
