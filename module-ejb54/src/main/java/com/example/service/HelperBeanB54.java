package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB54 {

    @EJB
    private HelperBeanA54 helperBeanA54;

    public String identify() {
        return "HelperBeanB54";
    }
}
