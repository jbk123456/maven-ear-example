package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF124 {

    @EJB
    private HelperBeanE124 helperBeanE124;

    public String identify() {
        return "HelperBeanF124";
    }
}
