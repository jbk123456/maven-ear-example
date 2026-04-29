package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE158 {

    @EJB
    private HelperBeanD158 helperBeanD158;

    public String identify() {
        return "HelperBeanE158";
    }
}
