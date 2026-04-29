package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD70 {

    @EJB
    private HelperBeanC70 helperBeanC70;

    public String identify() {
        return "HelperBeanD70";
    }
}
