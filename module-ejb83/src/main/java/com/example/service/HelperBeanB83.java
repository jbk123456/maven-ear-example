package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB83 {

    @EJB
    private HelperBeanA83 helperBeanA83;

    public String identify() {
        return "HelperBeanB83";
    }
}
