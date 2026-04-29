package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF35 {

    @EJB
    private HelperBeanE35 helperBeanE35;

    public String identify() {
        return "HelperBeanF35";
    }
}
