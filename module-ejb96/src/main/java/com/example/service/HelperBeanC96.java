package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC96 {

    @EJB
    private HelperBeanB96 helperBeanB96;

    public String identify() {
        return "HelperBeanC96";
    }
}
