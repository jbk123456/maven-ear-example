package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO102 {

    @EJB
    private HelperBeanN102 helperBeanN102;

    public String identify() {
        return "HelperBeanO102";
    }
}
