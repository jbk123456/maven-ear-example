package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF128 {

    @EJB
    private HelperBeanE128 helperBeanE128;

    public String identify() {
        return "HelperBeanF128";
    }
}
