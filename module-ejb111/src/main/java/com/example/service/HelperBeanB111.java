package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB111 {

    @EJB
    private HelperBeanA111 helperBeanA111;

    public String identify() {
        return "HelperBeanB111";
    }
}
