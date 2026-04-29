package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE27 {

    @EJB
    private HelperBeanD27 helperBeanD27;

    public String identify() {
        return "HelperBeanE27";
    }
}
