package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE94 {

    @EJB
    private HelperBeanD94 helperBeanD94;

    public String identify() {
        return "HelperBeanE94";
    }
}
