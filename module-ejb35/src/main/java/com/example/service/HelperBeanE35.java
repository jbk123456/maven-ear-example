package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE35 {

    @EJB
    private HelperBeanD35 helperBeanD35;

    public String identify() {
        return "HelperBeanE35";
    }
}
