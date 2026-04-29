package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF173 {

    @EJB
    private HelperBeanE173 helperBeanE173;

    public String identify() {
        return "HelperBeanF173";
    }
}
