package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO18 {

    @EJB
    private HelperBeanN18 helperBeanN18;

    public String identify() {
        return "HelperBeanO18";
    }
}
