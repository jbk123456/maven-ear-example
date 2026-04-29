package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB110 {

    @EJB
    private HelperBeanA110 helperBeanA110;

    public String identify() {
        return "HelperBeanB110";
    }
}
