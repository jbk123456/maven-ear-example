package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE125 {

    @EJB
    private HelperBeanD125 helperBeanD125;

    public String identify() {
        return "HelperBeanE125";
    }
}
