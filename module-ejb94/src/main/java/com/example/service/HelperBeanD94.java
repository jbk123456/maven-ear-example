package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD94 {

    @EJB
    private HelperBeanC94 helperBeanC94;

    public String identify() {
        return "HelperBeanD94";
    }
}
