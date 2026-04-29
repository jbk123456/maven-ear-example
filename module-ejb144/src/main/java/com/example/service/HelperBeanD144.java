package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD144 {

    @EJB
    private HelperBeanC144 helperBeanC144;

    public String identify() {
        return "HelperBeanD144";
    }
}
