package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG61 {

    @EJB
    private HelperBeanF61 helperBeanF61;

    public String identify() {
        return "HelperBeanG61";
    }
}
