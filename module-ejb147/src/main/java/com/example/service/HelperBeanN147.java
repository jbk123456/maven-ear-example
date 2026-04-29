package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN147 {

    @EJB
    private HelperBeanM147 helperBeanM147;

    public String identify() {
        return "HelperBeanN147";
    }
}
