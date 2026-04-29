package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB13 {

    @EJB
    private HelperBeanA13 helperBeanA13;

    public String identify() {
        return "HelperBeanB13";
    }
}
