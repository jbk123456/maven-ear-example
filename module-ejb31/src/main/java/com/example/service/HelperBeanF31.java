package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF31 {

    @EJB
    private HelperBeanE31 helperBeanE31;

    public String identify() {
        return "HelperBeanF31";
    }
}
