package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE92 {

    @EJB
    private HelperBeanD92 helperBeanD92;

    public String identify() {
        return "HelperBeanE92";
    }
}
