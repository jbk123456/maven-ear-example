package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE18 {

    @EJB
    private HelperBeanD18 helperBeanD18;

    public String identify() {
        return "HelperBeanE18";
    }
}
