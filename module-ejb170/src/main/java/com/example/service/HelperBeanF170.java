package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF170 {

    @EJB
    private HelperBeanE170 helperBeanE170;

    public String identify() {
        return "HelperBeanF170";
    }
}
