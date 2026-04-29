package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB49 {

    @EJB
    private HelperBeanA49 helperBeanA49;

    public String identify() {
        return "HelperBeanB49";
    }
}
