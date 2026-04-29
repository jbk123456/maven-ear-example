package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN91 {

    @EJB
    private HelperBeanM91 helperBeanM91;

    public String identify() {
        return "HelperBeanN91";
    }
}
