package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD129 {

    @EJB
    private HelperBeanC129 helperBeanC129;

    public String identify() {
        return "HelperBeanD129";
    }
}
