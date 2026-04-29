package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE118 {

    @EJB
    private HelperBeanD118 helperBeanD118;

    public String identify() {
        return "HelperBeanE118";
    }
}
