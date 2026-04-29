package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF140 {

    @EJB
    private HelperBeanE140 helperBeanE140;

    public String identify() {
        return "HelperBeanF140";
    }
}
