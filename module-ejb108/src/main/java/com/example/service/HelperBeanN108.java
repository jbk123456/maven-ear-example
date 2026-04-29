package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN108 {

    @EJB
    private HelperBeanM108 helperBeanM108;

    public String identify() {
        return "HelperBeanN108";
    }
}
