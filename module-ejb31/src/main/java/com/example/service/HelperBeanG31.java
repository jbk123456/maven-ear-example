package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG31 {

    @EJB
    private HelperBeanF31 helperBeanF31;

    public String identify() {
        return "HelperBeanG31";
    }
}
