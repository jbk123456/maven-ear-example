package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD96 {

    @EJB
    private HelperBeanC96 helperBeanC96;

    public String identify() {
        return "HelperBeanD96";
    }
}
