package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF26 {

    @EJB
    private HelperBeanE26 helperBeanE26;

    public String identify() {
        return "HelperBeanF26";
    }
}
