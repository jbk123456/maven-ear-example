package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG117 {

    @EJB
    private HelperBeanF117 helperBeanF117;

    public String identify() {
        return "HelperBeanG117";
    }
}
