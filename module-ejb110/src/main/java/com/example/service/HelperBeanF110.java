package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF110 {

    @EJB
    private HelperBeanE110 helperBeanE110;

    public String identify() {
        return "HelperBeanF110";
    }
}
