package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE110 {

    @EJB
    private HelperBeanD110 helperBeanD110;

    public String identify() {
        return "HelperBeanE110";
    }
}
