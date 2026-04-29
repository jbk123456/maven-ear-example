package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF161 {

    @EJB
    private HelperBeanE161 helperBeanE161;

    public String identify() {
        return "HelperBeanF161";
    }
}
