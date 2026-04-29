package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM122 {

    @EJB
    private HelperBeanL122 helperBeanL122;

    public String identify() {
        return "HelperBeanM122";
    }
}
