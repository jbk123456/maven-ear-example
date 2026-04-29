package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF43 {

    @EJB
    private HelperBeanE43 helperBeanE43;

    public String identify() {
        return "HelperBeanF43";
    }
}
