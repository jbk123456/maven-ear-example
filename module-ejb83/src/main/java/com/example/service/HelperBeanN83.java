package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN83 {

    @EJB
    private HelperBeanM83 helperBeanM83;

    public String identify() {
        return "HelperBeanN83";
    }
}
