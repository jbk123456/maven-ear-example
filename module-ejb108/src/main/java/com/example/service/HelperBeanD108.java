package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD108 {

    @EJB
    private HelperBeanC108 helperBeanC108;

    public String identify() {
        return "HelperBeanD108";
    }
}
