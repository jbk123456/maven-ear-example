package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG92 {

    @EJB
    private HelperBeanF92 helperBeanF92;

    public String identify() {
        return "HelperBeanG92";
    }
}
