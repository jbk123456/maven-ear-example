package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD120 {

    @EJB
    private HelperBeanC120 helperBeanC120;

    public String identify() {
        return "HelperBeanD120";
    }
}
