package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD104 {

    @EJB
    private HelperBeanC104 helperBeanC104;

    public String identify() {
        return "HelperBeanD104";
    }
}
