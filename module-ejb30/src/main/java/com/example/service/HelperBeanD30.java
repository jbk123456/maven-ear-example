package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD30 {

    @EJB
    private HelperBeanC30 helperBeanC30;

    public String identify() {
        return "HelperBeanD30";
    }
}
