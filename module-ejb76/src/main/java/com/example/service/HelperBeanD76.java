package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD76 {

    @EJB
    private HelperBeanC76 helperBeanC76;

    public String identify() {
        return "HelperBeanD76";
    }
}
