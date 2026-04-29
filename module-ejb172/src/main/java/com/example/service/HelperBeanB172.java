package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB172 {

    @EJB
    private HelperBeanA172 helperBeanA172;

    public String identify() {
        return "HelperBeanB172";
    }
}
