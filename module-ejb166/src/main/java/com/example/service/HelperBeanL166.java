package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL166 {

    @EJB
    private HelperBeanK166 helperBeanK166;

    public String identify() {
        return "HelperBeanL166";
    }
}
