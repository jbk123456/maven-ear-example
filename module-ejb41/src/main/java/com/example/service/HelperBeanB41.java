package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB41 {

    @EJB
    private HelperBeanA41 helperBeanA41;

    public String identify() {
        return "HelperBeanB41";
    }
}
