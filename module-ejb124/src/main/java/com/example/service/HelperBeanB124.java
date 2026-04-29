package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB124 {

    @EJB
    private HelperBeanA124 helperBeanA124;

    public String identify() {
        return "HelperBeanB124";
    }
}
