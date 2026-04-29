package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD43 {

    @EJB
    private HelperBeanC43 helperBeanC43;

    public String identify() {
        return "HelperBeanD43";
    }
}
