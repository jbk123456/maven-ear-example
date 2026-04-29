package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE124 {

    @EJB
    private HelperBeanD124 helperBeanD124;

    public String identify() {
        return "HelperBeanE124";
    }
}
