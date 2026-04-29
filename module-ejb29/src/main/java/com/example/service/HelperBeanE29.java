package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE29 {

    @EJB
    private HelperBeanD29 helperBeanD29;

    public String identify() {
        return "HelperBeanE29";
    }
}
