package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO149 {

    @EJB
    private HelperBeanN149 helperBeanN149;

    public String identify() {
        return "HelperBeanO149";
    }
}
