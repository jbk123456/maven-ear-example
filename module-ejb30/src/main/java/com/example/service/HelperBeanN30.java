package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN30 {

    @EJB
    private HelperBeanM30 helperBeanM30;

    public String identify() {
        return "HelperBeanN30";
    }
}
