package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO83 {

    @EJB
    private HelperBeanN83 helperBeanN83;

    public String identify() {
        return "HelperBeanO83";
    }
}
