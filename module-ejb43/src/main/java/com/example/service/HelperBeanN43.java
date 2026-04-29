package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN43 {

    @EJB
    private HelperBeanM43 helperBeanM43;

    public String identify() {
        return "HelperBeanN43";
    }
}
