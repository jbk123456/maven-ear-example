package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF5 {

    @EJB
    private HelperBeanE5 helperBeanE5;

    public String identify() {
        return "HelperBeanF5";
    }
}
