package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG86 {

    @EJB
    private HelperBeanF86 helperBeanF86;

    public String identify() {
        return "HelperBeanG86";
    }
}
