package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB37 {

    @EJB
    private HelperBeanA37 helperBeanA37;

    public String identify() {
        return "HelperBeanB37";
    }
}
