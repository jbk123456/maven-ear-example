package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO62 {

    @EJB
    private HelperBeanN62 helperBeanN62;

    public String identify() {
        return "HelperBeanO62";
    }
}
