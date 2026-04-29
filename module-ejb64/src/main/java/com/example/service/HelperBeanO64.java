package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO64 {

    @EJB
    private HelperBeanN64 helperBeanN64;

    public String identify() {
        return "HelperBeanO64";
    }
}
