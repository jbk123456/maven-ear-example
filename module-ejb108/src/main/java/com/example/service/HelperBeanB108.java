package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB108 {

    @EJB
    private HelperBeanA108 helperBeanA108;

    public String identify() {
        return "HelperBeanB108";
    }
}
