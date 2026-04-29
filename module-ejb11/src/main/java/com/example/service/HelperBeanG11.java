package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG11 {

    @EJB
    private HelperBeanF11 helperBeanF11;

    public String identify() {
        return "HelperBeanG11";
    }
}
