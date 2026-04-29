package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO147 {

    @EJB
    private HelperBeanN147 helperBeanN147;

    public String identify() {
        return "HelperBeanO147";
    }
}
