package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF17 {

    @EJB
    private HelperBeanE17 helperBeanE17;

    public String identify() {
        return "HelperBeanF17";
    }
}
