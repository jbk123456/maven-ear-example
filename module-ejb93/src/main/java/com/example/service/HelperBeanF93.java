package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF93 {

    @EJB
    private HelperBeanE93 helperBeanE93;

    public String identify() {
        return "HelperBeanF93";
    }
}
