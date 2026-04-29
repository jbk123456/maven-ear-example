package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD84 {

    @EJB
    private HelperBeanC84 helperBeanC84;

    public String identify() {
        return "HelperBeanD84";
    }
}
