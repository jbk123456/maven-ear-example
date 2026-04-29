package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ123 {

    @EJB
    private HelperBeanI123 helperBeanI123;

    public String identify() {
        return "HelperBeanJ123";
    }
}
