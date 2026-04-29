package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE56 {

    @EJB
    private HelperBeanD56 helperBeanD56;

    public String identify() {
        return "HelperBeanE56";
    }
}
