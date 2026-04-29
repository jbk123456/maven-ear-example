package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN39 {

    @EJB
    private HelperBeanM39 helperBeanM39;

    public String identify() {
        return "HelperBeanN39";
    }
}
