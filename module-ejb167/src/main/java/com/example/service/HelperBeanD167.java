package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD167 {

    @EJB
    private HelperBeanC167 helperBeanC167;

    public String identify() {
        return "HelperBeanD167";
    }
}
