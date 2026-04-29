package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB160 {

    @EJB
    private HelperBeanA160 helperBeanA160;

    public String identify() {
        return "HelperBeanB160";
    }
}
