package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE30 {

    @EJB
    private HelperBeanD30 helperBeanD30;

    public String identify() {
        return "HelperBeanE30";
    }
}
