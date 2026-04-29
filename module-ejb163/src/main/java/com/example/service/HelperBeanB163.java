package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB163 {

    @EJB
    private HelperBeanA163 helperBeanA163;

    public String identify() {
        return "HelperBeanB163";
    }
}
