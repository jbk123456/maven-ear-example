package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB24 {

    @EJB
    private HelperBeanA24 helperBeanA24;

    public String identify() {
        return "HelperBeanB24";
    }
}
