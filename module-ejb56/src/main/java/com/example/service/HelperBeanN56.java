package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN56 {

    @EJB
    private HelperBeanM56 helperBeanM56;

    public String identify() {
        return "HelperBeanN56";
    }
}
