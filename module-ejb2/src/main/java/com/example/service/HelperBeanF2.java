package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF2 {

    @EJB
    private HelperBeanE2 helperBeanE2;

    public String identify() {
        return "HelperBeanF2";
    }
}
