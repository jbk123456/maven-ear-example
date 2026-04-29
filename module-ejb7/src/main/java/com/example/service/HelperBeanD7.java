package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD7 {

    @EJB
    private HelperBeanC7 helperBeanC7;

    public String identify() {
        return "HelperBeanD7";
    }
}
