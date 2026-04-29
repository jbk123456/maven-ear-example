package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF79 {

    @EJB
    private HelperBeanE79 helperBeanE79;

    public String identify() {
        return "HelperBeanF79";
    }
}
