package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD28 {

    @EJB
    private HelperBeanC28 helperBeanC28;

    public String identify() {
        return "HelperBeanD28";
    }
}
