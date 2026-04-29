package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG108 {

    @EJB
    private HelperBeanF108 helperBeanF108;

    public String identify() {
        return "HelperBeanG108";
    }
}
