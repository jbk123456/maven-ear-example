package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO56 {

    @EJB
    private HelperBeanN56 helperBeanN56;

    public String identify() {
        return "HelperBeanO56";
    }
}
