package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD66 {

    @EJB
    private HelperBeanC66 helperBeanC66;

    public String identify() {
        return "HelperBeanD66";
    }
}
