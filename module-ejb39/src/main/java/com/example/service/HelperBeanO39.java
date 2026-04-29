package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO39 {

    @EJB
    private HelperBeanN39 helperBeanN39;

    public String identify() {
        return "HelperBeanO39";
    }
}
