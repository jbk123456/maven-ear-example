package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG39 {

    @EJB
    private HelperBeanF39 helperBeanF39;

    public String identify() {
        return "HelperBeanG39";
    }
}
