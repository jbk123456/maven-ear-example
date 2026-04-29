package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF101 {

    @EJB
    private HelperBeanE101 helperBeanE101;

    public String identify() {
        return "HelperBeanF101";
    }
}
