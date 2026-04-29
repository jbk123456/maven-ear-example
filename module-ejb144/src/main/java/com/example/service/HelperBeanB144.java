package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB144 {

    @EJB
    private HelperBeanA144 helperBeanA144;

    public String identify() {
        return "HelperBeanB144";
    }
}
