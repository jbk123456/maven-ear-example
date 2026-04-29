package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD175 {

    @EJB
    private HelperBeanC175 helperBeanC175;

    public String identify() {
        return "HelperBeanD175";
    }
}
