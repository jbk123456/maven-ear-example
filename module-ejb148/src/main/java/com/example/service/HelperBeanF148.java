package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF148 {

    @EJB
    private HelperBeanE148 helperBeanE148;

    public String identify() {
        return "HelperBeanF148";
    }
}
