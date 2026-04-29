package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB46 {

    @EJB
    private HelperBeanA46 helperBeanA46;

    public String identify() {
        return "HelperBeanB46";
    }
}
