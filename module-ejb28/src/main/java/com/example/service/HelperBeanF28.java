package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF28 {

    @EJB
    private HelperBeanE28 helperBeanE28;

    public String identify() {
        return "HelperBeanF28";
    }
}
