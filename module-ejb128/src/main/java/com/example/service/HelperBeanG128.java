package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG128 {

    @EJB
    private HelperBeanF128 helperBeanF128;

    public String identify() {
        return "HelperBeanG128";
    }
}
