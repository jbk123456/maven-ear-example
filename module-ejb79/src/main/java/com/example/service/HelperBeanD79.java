package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD79 {

    @EJB
    private HelperBeanC79 helperBeanC79;

    public String identify() {
        return "HelperBeanD79";
    }
}
