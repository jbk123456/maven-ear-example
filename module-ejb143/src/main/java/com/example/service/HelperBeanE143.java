package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE143 {

    @EJB
    private HelperBeanD143 helperBeanD143;

    public String identify() {
        return "HelperBeanE143";
    }
}
