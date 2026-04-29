package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF153 {

    @EJB
    private HelperBeanE153 helperBeanE153;

    public String identify() {
        return "HelperBeanF153";
    }
}
