package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN140 {

    @EJB
    private HelperBeanM140 helperBeanM140;

    public String identify() {
        return "HelperBeanN140";
    }
}
