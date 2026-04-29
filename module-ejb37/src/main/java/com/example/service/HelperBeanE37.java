package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE37 {

    @EJB
    private HelperBeanD37 helperBeanD37;

    public String identify() {
        return "HelperBeanE37";
    }
}
