package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF123 {

    @EJB
    private HelperBeanE123 helperBeanE123;

    public String identify() {
        return "HelperBeanF123";
    }
}
