package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF1 {

    @EJB
    private HelperBeanE1 helperBeanE1;

    public String identify() {
        return "HelperBeanF1";
    }
}
