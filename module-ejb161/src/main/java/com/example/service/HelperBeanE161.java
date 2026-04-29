package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE161 {

    @EJB
    private HelperBeanD161 helperBeanD161;

    public String identify() {
        return "HelperBeanE161";
    }
}
