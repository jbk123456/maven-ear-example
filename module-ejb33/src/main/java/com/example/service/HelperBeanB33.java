package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB33 {

    @EJB
    private HelperBeanA33 helperBeanA33;

    public String identify() {
        return "HelperBeanB33";
    }
}
