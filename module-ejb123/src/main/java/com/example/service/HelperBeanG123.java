package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG123 {

    @EJB
    private HelperBeanF123 helperBeanF123;

    public String identify() {
        return "HelperBeanG123";
    }
}
