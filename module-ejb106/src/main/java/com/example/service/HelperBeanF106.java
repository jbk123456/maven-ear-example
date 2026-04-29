package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF106 {

    @EJB
    private HelperBeanE106 helperBeanE106;

    public String identify() {
        return "HelperBeanF106";
    }
}
