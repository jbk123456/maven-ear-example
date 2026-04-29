package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE79 {

    @EJB
    private HelperBeanD79 helperBeanD79;

    public String identify() {
        return "HelperBeanE79";
    }
}
