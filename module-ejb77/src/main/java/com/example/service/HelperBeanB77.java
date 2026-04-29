package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB77 {

    @EJB
    private HelperBeanA77 helperBeanA77;

    public String identify() {
        return "HelperBeanB77";
    }
}
