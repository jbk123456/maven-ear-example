package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB95 {

    @EJB
    private HelperBeanA95 helperBeanA95;

    public String identify() {
        return "HelperBeanB95";
    }
}
