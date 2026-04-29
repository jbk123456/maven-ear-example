package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO99 {

    @EJB
    private HelperBeanN99 helperBeanN99;

    public String identify() {
        return "HelperBeanO99";
    }
}
