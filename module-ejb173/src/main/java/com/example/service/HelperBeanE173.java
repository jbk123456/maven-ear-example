package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE173 {

    @EJB
    private HelperBeanD173 helperBeanD173;

    public String identify() {
        return "HelperBeanE173";
    }
}
