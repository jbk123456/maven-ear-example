package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE128 {

    @EJB
    private HelperBeanD128 helperBeanD128;

    public String identify() {
        return "HelperBeanE128";
    }
}
