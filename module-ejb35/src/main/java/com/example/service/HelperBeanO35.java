package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO35 {

    @EJB
    private HelperBeanN35 helperBeanN35;

    public String identify() {
        return "HelperBeanO35";
    }
}
