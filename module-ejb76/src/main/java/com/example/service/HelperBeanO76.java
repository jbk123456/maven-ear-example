package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO76 {

    @EJB
    private HelperBeanN76 helperBeanN76;

    public String identify() {
        return "HelperBeanO76";
    }
}
