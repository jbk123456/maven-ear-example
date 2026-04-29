package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN131 {

    @EJB
    private HelperBeanM131 helperBeanM131;

    public String identify() {
        return "HelperBeanN131";
    }
}
