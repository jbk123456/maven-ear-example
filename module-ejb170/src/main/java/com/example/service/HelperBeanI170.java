package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI170 {

    @EJB
    private HelperBeanH170 helperBeanH170;

    public String identify() {
        return "HelperBeanI170";
    }
}
