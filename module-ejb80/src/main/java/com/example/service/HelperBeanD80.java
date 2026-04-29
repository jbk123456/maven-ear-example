package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD80 {

    @EJB
    private HelperBeanC80 helperBeanC80;

    public String identify() {
        return "HelperBeanD80";
    }
}
