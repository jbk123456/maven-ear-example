package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO1 {

    @EJB
    private HelperBeanN1 helperBeanN1;

    public String identify() {
        return "HelperBeanO1";
    }
}
