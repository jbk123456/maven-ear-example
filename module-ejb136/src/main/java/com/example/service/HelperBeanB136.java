package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB136 {

    @EJB
    private HelperBeanA136 helperBeanA136;

    public String identify() {
        return "HelperBeanB136";
    }
}
