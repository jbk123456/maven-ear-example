package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD37 {

    @EJB
    private HelperBeanC37 helperBeanC37;

    public String identify() {
        return "HelperBeanD37";
    }
}
