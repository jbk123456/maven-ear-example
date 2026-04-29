package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN163 {

    @EJB
    private HelperBeanM163 helperBeanM163;

    public String identify() {
        return "HelperBeanN163";
    }
}
