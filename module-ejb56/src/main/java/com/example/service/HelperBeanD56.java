package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD56 {

    @EJB
    private HelperBeanC56 helperBeanC56;

    public String identify() {
        return "HelperBeanD56";
    }
}
