package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD13 {

    @EJB
    private HelperBeanC13 helperBeanC13;

    public String identify() {
        return "HelperBeanD13";
    }
}
