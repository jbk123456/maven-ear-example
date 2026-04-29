package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB73 {

    @EJB
    private HelperBeanA73 helperBeanA73;

    public String identify() {
        return "HelperBeanB73";
    }
}
