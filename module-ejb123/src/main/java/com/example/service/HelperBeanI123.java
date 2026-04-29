package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI123 {

    @EJB
    private HelperBeanH123 helperBeanH123;

    public String identify() {
        return "HelperBeanI123";
    }
}
