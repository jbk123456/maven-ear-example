package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC129 {

    @EJB
    private HelperBeanB129 helperBeanB129;

    public String identify() {
        return "HelperBeanC129";
    }
}
