package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD46 {

    @EJB
    private HelperBeanC46 helperBeanC46;

    public String identify() {
        return "HelperBeanD46";
    }
}
